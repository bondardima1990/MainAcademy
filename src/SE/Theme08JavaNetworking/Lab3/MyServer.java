package SE.Theme08JavaNetworking.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Write a program (for example, MyServer), which is in an infinite loop creates a new socket connection upon request from another program,
 * and then creates a separate thread to communicate with the program <p>
 *
 * Add to the program MyServer a ServerThread class as a thread which receives the socket and creates data streams.
 * Then, on receiving the data of program from a socket, sends the string "PONG"
 * and prints the string "PING-PONG" with the iteration number and the name of the program.
 */
public class MyServer implements Runnable {
    public static void main(String[] args) {
        new MyServer().run();
    }

    @Override
    public void run() {
        try(ServerSocket serverSocket = new ServerSocket(8899)) {
            System.out.println("Server is Running");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress().getHostName() + " connected");
                new ServerThread(socket).run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class ServerThread extends Thread{
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private String name;

    public ServerThread(Socket socket) throws IOException {
        printStream = new PrintStream(socket.getOutputStream());
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        name = bufferedReader.readLine();
    }

    @Override
    public void run() {
        int i = 0;
        String string;
        try {
            while ((string = bufferedReader.readLine()) != null){
                System.out.println(string + " - PONG " + ++i);
                printStream.println("PONG " + i);
                System.out.println(i + " with " + this.name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            disconect();
        }
    }

    public void disconect() {
        try {
            System.out.println(this.name + " disconected");
            printStream.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.interrupt();
        }
    }
}
