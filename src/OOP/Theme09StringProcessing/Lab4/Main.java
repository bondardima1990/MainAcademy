package OOP.Theme09StringProcessing.Lab4;

import java.util.StringTokenizer;

/**
 * Created by DELL on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer tokenizer = new StringTokenizer(myStr, " ,.");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextElement());
        }
    }
}
