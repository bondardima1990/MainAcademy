package OOP.Theme09StringProcessing.Lab3;

/**
 * Create static method: uniqueChars(String s), which must take a String as argument
 * and return an array of distinct (unique) chars (char[]) of the given string.<p>
 * In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument.<p>
 * Print result to console.<p>
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
