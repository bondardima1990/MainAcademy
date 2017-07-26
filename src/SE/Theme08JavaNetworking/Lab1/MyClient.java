package SE.Theme08JavaNetworking.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient implements Runnable {
    public static void main(String[] args) {
        new MyClient().run();
    }

    Student student = new Student("Dima", "Java", 1);

    @Override
    public void run() {

        System.out.println("Client online");

        try(Socket socket = new Socket("localhost", 8899)) {

            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(student);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
