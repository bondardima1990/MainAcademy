package SE.Theme07Java8NewFeatures.Lab3;

/**
 * 1) Add a MyConverter functional interface that contains an convertStr(String str) abstract method
 *    to convert a string to uppercase and a isNull(String str) static method to check the string to null.
 *
 * 2) Add in a Main class a updateList() static method, which converts the strings of list to uppercases.
 *
 * 3) Add in a main() method code that invokes updateList() method and output the result.
 */

public class Main {
    public static void main(String[] args) {

    }

    interface MyConverter{
        static String convertStr(String str){
            return  str.toUpperCase();
        }

        static String isNull(String str){
            return null;
        }
    }
}
