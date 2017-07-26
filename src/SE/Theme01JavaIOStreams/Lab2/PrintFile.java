package SE.Theme01JavaIOStreams.Lab2;

import java.io.*;

/**
 * Created by DELL on 13.04.2017.
 */
public class PrintFile {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {

            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
