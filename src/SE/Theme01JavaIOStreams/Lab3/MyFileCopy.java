package SE.Theme01JavaIOStreams.Lab3;

import java.io.*;

/**
 * Created by DELL on 20.04.2017.
 */
public class MyFileCopy {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]))
        {
            byte[] buffer = new byte[fileInputStream.available()];

            fileInputStream.read(buffer, 0, buffer.length);

            fileOutputStream.write(buffer,0,buffer.length);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
