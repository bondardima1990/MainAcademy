package SE.Theme08JavaNetworking.Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Create a class Main with a main() method, which: <p>
 *
 * 1) Defines a resource type URL ("http://www.brainacad.com"); <p>
 *
 * 2) Establishes with him the type of connection URLConnection; <p>
 *
 * 3) Opens a stream for reading and outputs the result.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        URL oracle = new URL("http://www.brainacad.com");
        URLConnection urlConnection = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String string;
        while ((string = in.readLine()) != null){
            System.out.println(string);
        }

    }
}
