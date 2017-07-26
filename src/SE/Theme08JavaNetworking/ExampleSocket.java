package SE.Theme08JavaNetworking;

import java.io.*;
import java.net.Socket;

public class ExampleSocket {
    public static void main(String[] args) throws IOException {

        Student student = new Student("Alex", "Java SE");

        Socket socket = new Socket("localhost", 8899);
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        os.writeObject(student);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());

        os.flush();
        os.close();
    }
}
