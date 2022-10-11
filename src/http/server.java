package http;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class server {
    int port=9000;
    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

    public server() throws IOException {
    }

    public void main(String[] args){
        System.out.println("server started at " + port);
        server.createContext("/",  new RootHandler());
        server.createContext("/echoHeader", new EchoHeaderHandler());
        server.createContext("/echoGet", new EchoGetHandler());
        server.createContext("/echoPost", new EchoPostHandler());
        server.setExecutor(null);
        server.start();
    }
    public class RootHandler implements HttpHandler {

        public void handle(HttpExchange he) throws IOException {
            String response = "Server start success if you see this message" + " Port: " + port;
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

    }
    public static class EchoHeaderHandler implements HttpHandler, http.EchoHeaderHandler {

        @Override
        public void handle(HttpExchange he) throws IOException {
            Headers headers = he.getRequestHeaders();
            Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
            StringBuilder response = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : entries)
                response.append(entry.toString()).append("n");
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.toString().getBytes());
            os.close();
        }

    }
    public static class EchoGetHandler implements HttpHandler {

        @Override

        public void handle(HttpExchange he) throws IOException {
            // parse request
            Map<String, Object> parameters = new HashMap<>();
            URI requestedUri = he.getRequestURI();
            String query = requestedUri.getRawQuery();
            parseQuery(query, parameters);

            // send response
            StringBuilder response = new StringBuilder();
            for (String key : parameters.keySet())
                response.append(key).append(" = ").append(parameters.get(key)).append("n");
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.toString().getBytes());

        }

    }
    public static class EchoPostHandler implements HttpHandler {

        @Override

        public void handle(HttpExchange he) throws IOException {
            // parse request
            Map<String, Object> parameters = new HashMap<>();
            InputStreamReader isr = new InputStreamReader(he.getRequestBody(), StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String query = br.readLine();
            parseQuery(query, parameters);

            // send response
            StringBuilder response = new StringBuilder();
            for (String key : parameters.keySet())
                response.append(key).append(" = ").append(parameters.get(key)).append("n");
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.toString().getBytes());
            os.close();
        }

    }
    public static void parseQuery(String query, Map<String, Object> parameters) throws UnsupportedEncodingException {

        if (query != null) {
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                String[] param = pair.split("=");
                String key = null;
                String value = null;
                if (param.length > 0) {
                    key = URLDecoder.decode(param[0], System.getProperty("file.encoding"));
                }


                if (param.length > 1) {
                    value = URLDecoder.decode(param[1], System.getProperty("file.encoding"));
                }

                if (parameters.containsKey(key)) {
                    Object obj = parameters.get(key);
                    if (obj instanceof List<?>) {
                        List values = (List) obj;
                        values.add(value);

                    } else if (obj instanceof String) {
                        List<String> values = new ArrayList<>();
                        values.add((String) obj);
                        values.add(value);
                        parameters.put(key, values);
                    }
                } else {
                    parameters.put(key, value);
                }

            }

        }

    }
}
