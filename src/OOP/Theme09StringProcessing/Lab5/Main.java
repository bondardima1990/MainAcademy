package OOP.Theme09StringProcessing.Lab5;

/**
 * Create public static method checkPersonWithRegExp(String userNameString) which take String as argument
 * and return boolean value. This method must return true only if argument string value begin from Uppercase,
 * then other chars in Lowercase and contains only letters.<p>
 * In main() method declare array of String with next values: {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}<p>
 * Add code to check each of these values with checkPersonWithRegExp() method and print result to console.<p>
 */
public class Main {
    public static void main(String[] args) {
        String[] userNameString = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String userName : userNameString) {
            System.out.println(userName + " - " + checkPersonWithRegExp(userName));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString){
        return userNameString.matches("[A-Z][a-z]+");
    }
}
