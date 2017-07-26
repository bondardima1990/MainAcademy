package SE.Theme08JavaNetworking.Lab4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Create a class MyRecipient with a main() method, which: <p>
 *     - creates a buffer for receiving data packets and a file for writing data; <p>
 *     - creates a socket connection on the basis of DatagramSocket class and organizes the wait loop of data packets,
 *       which receives the data and writes it to a file.
 */
public class MyRecipient {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] buffer = new byte[1024];

        while (true){
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(datagramPacket);
            String sentence = new String(datagramPacket.getData());
            System.out.println(sentence);
        }

    }
}
