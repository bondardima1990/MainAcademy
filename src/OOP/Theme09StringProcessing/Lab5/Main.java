package OOP.Theme09StringProcessing.Lab5;

/**
 * Created by DELL on 07.03.2017.
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
