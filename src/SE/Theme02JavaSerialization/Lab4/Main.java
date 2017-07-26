package SE.Theme02JavaSerialization.Lab4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by DELL on 22.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        User user = new User("Dima", "Bondar",26);

        write(user.toString());

        read();
    }

    private static void write(String string) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("users.ser", "rw")) {

            //В условии через writeBytes(String ...))
            randomAccessFile.writeBytes(string);

            //а можно ли так???
            //randomAccessFile.write(string.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("users.ser", "r")) {

            int i = randomAccessFile.read();
            while (i != -1){
                System.out.print((char)i);
                i = randomAccessFile.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



