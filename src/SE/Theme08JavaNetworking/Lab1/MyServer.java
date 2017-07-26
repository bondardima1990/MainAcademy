package SE.Theme08JavaNetworking.Lab1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer implements Runnable {
    public static void main(String[] args) {
        new MyServer().run();
    }

    @Override
    public void run() {
        try(ServerSocket listener = new ServerSocket(8899)) {

            System.out.println("Server is Running");
            System.out.println("Waiting for connection...");

            Socket socket = listener.accept();
            System.out.println("Client Connected");

            ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
            Student student = (Student)oi.readObject();
            System.out.println(student);

            socket.getOutputStream().write("The end".getBytes());

            oi.close();
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
