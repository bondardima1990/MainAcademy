package SE.Theme01JavaIOStreams;

import java.io.*;

/**
 * Created by DELL on 23.03.2017.
 */
public class Examples {
    public static void main(String[] args) throws IOException {
        //example1();
        //example2();
        example3();
    }


    private static void example1(){
        InputStream stdin = System.in;
        try {
            int val = stdin.read();
            System.out.println(val);
        } catch (IOException e) {

        }
    }

    private static void example2(){
        OutputStream stdout = System.out;
        try {
            stdout.write(new byte[]{97,98,99});
        }catch (IOException e){

        }
    }

    private static void example3() throws IOException {

        File inputReadFile = new File("input.txt");
        File outputReadFile = new File("output.txt");

        FileInputStream in = new FileInputStream(inputReadFile);
        FileOutputStream out = new FileOutputStream(inputReadFile);

        if(inputReadFile.exists() & outputReadFile.exists()){
            inputReadFile.delete();
            outputReadFile.delete();
            System.err.print("Files deleted");
            return;
        }

        System.out.println("inputReadFile created = " + inputReadFile.createNewFile());
        System.out.println("outputReadFile created = " + outputReadFile.createNewFile());

        out.write("This is my first file".getBytes());

        int c;
        while ((c = in.read()) != -1){
                out.write(c);
        }
        in.close();
        out.close();
    }
}


