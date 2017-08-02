package OOP.Theme09StringProcessing.Lab1;

/**
 * Create a class Main_1 with a main() method. In method main() declare local variable myStr of String type
 * and assign a value: “abracadabra”. Using the methods of the class String, do next steps:<p>
 * Find the index of first “ra” substring of myStr value and print result to console.<p>
 * Find the index of last “ra” substring of myStr value and print result to console.<p>
 * Get substring of myStr from 3 to 7 char index and print result to console.<p>
 * Create static method reverseString(String) which return String value as result with changed order
 * of letters (reverse it, for example “abcd” ->”dcba”).<p>
 * Invoke reverseString() method with myStr argument and print result to console.<p>
 */
public class Main {
    public static void main(String[] args) {

        String myStr = "abracadabra";

        int raFirst = myStr.indexOf("ra");
        System.out.println(raFirst);

        int raLast = myStr.lastIndexOf("ra");
        System.out.println(raLast);

        String subStr = myStr.substring(3, 7);
        System.out.println(subStr);


        String s = new StringBuilder(myStr).reverse().toString();
        System.out.println(s);
    }
}
