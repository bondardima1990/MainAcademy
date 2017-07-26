package SE.Theme08JavaNetworking.Lab3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Write a program (for example, MyClient), which creates a socket connection to another program,
 * and then in a loop on of 10 iterations sends her string "PING" and outputs the response.
 * Iterations are performed with a delay of 1 second.
 */
public class MyClient implements Runnable {
    private String name;

    public MyClient(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        new MyClient(sc.next()).run();
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 8899);
            PrintStream ps = new PrintStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ps.println(this.name);
            for (int i = 1; i <= 10; i++) {
                ps.println("PING");
                System.out.println(br.readLine());
                Thread.sleep(1000);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
