package OOP.Theme09StringProcessing.Lab3;

/**
 * Created by DELL on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String string = "Using methods of class String";

        String result = uniqueChars(string);
        System.out.println(result);
    }

    public static String uniqueChars(String string) {
        char[] charsArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charsArray.length; i++) {
            char totalChar = charsArray[i];
            String substring = string.substring(0, i) + string.substring(i+1);
            if (!substring.contains(totalChar + ""))
                stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

}
