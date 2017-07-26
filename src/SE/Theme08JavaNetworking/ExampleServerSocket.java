package SE.Theme08JavaNetworking;

import java.io.*;
import java.net.*;

public class ExampleServerSocket {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket listener = new ServerSocket(8899);
        Socket socket = listener.accept();

        socket.getOutputStream().write("From Server".getBytes());

        ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
        Student student = (Student)oi.readObject();
        System.out.println(student);
        oi.close();
        socket.close();
    }
}
