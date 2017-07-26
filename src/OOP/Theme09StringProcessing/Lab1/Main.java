package OOP.Theme09StringProcessing.Lab1;

/**
 * Created by DELL on 18.02.2017.
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
