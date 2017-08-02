package OOP.Theme09StringProcessing.Lab2;

import java.util.StringTokenizer;

/**
 * Create a class Main with a main() method. In method main() declare two local variables
 * myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.<p>
 * Write code to display all of the letters, which are present in the first word, but absent in the second.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        String result = getSymbols(myStr1, myStr2);
        System.out.println(result);
    }

    private static String getSymbols(String myStr1, String myStr2) {
        StringTokenizer tokenizer = new StringTokenizer(myStr1.toLowerCase(), myStr2.toLowerCase());
        String token = "";
        while (tokenizer.hasMoreTokens()){
            token += tokenizer.nextToken();
        }
        return token;
    }
}
