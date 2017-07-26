package OOP.Theme09StringProcessing.Lab2;

import java.util.StringTokenizer;

/**
 * Created by DELL on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        String result = getSumbols(myStr1, myStr2);
        System.out.println(result);
    }

    private static String getSumbols(String myStr1, String myStr2) {
        StringTokenizer tokenizer = new StringTokenizer(myStr1.toLowerCase(), myStr2.toLowerCase());
        String token = "";
        while (tokenizer.hasMoreTokens()){
            token += tokenizer.nextToken();
        }

        return token;
    }
}
