package OOP.Theme09StringProcessing.Lab4;

import java.util.StringTokenizer;

/**
 * In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot” delimiter
 * using StringTokennizer class, and iterate the StringTokenizer elements and print it out one by one to console.<p>
 * String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.<p>
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
