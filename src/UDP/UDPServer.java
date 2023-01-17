package UDP;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a DatagramSocket on the server
        DatagramSocket serverSocket = new DatagramSocket(9876);

        while (true) {
            // Create a byte array to store the incoming data
            byte[] receiveData = new byte[1024];

            // Create a DatagramPacket to receive the data
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive the data
            serverSocket.receive(receivePacket);

            // Get the object from the received data
            Object receivedObject = deserialize(receivePacket.getData());

            // Get the IP address and port of the sender
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            // Print the received object
            System.out.println("Received object: " + receivedObject);

            // Send a response to the sender
            String response = "Object received";
            byte[] sendData = response.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }

    private static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream b = new ByteArrayInputStream(data)) {
            try (ObjectInputStream o = new ObjectInputStream(b)) {
                return o.readObject();
            }
        }
    }
}
