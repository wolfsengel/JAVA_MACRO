package UDP;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        // Create the object to send
        String objToSend = "Laura fea";

        // Get the IP address of the server
        InetAddress IPAddress = InetAddress.getByName("localhost");

        // Create a DatagramSocket on the client
        DatagramSocket clientSocket = new DatagramSocket();

        // Convert the object to a byte array
        byte[] sendData = serialize(objToSend);

        // Create a DatagramPacket to send the data
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);

        // Send the data
        clientSocket.send(sendPacket);

        // Create a byte array to store the incoming data
        byte[] receiveData = new byte[1024];

        // Create a DatagramPacket to receive the data
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        // Receive the data
        clientSocket.receive(receivePacket);
        // Print the response from the server
        String response = new String(receivePacket.getData());
        System.out.println("Server response: " + response);

        // Close the socket
        clientSocket.close();
    }

    private static byte[] serialize(Object obj) throws IOException {
        try (ByteArrayOutputStream b = new ByteArrayOutputStream()) {
            try (ObjectOutputStream o = new ObjectOutputStream(b)) {
                o.writeObject(obj);
            }
            return b.toByteArray();
        }
    }
}

