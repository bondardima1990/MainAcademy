package SE.Theme01JavaIOStreams.Lab4;

import java.io.*;

/**
 * Created by DELL on 20.04.2017.
 */
public class ReplacementInFile {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Open file: ");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(bf.readLine()))) {

            bf.close();
            String s;
            while ((s = bufferedReader.readLine()) != null){
                s = s.replaceAll("public", "privat");
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
