package SE.Theme08JavaNetworking.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Create a class MySender with a main() method, which: <p>
 *     - enters the file name for his transmission over the network; <p>
 *     - creates a socket connection on the basis of DatagramSocket class
 *       and organizes packet for transmission in the form of an instance of a DatagramPacket class.
 */
public class MySender {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAdress = InetAddress.getByName("localhost");
        String sentence = in.readLine();
        byte[] sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAdress, 9999);
        clientSocket.send(sendPacket);

    }
}
