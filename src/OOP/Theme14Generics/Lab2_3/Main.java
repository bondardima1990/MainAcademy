package OOP.Theme14Generics.Lab2_3;

import static OOP.Theme14Generics.Lab2_3.MyTestMethod.calcNum;
import static OOP.Theme14Generics.Lab2_3.MyTestMethod.calcSum;

/**
 * Created by DELL on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integersArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doublesArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

        int countInteger = calcNum(integersArray, 3);
        int countDouble = calcNum(doublesArray, 3);

        System.out.println("Number of elements that are greater than 3: " + countInteger);
        System.out.println("Number of elements that are greater than 3: " + countDouble);

        double sumInteger = calcSum(integersArray, 3);
        double sumDouble = calcSum(doublesArray, 3);

        System.out.println("Sum of elements that are greater than 3: " + sumInteger);
        System.out.println("Sum of elements that are greater than 3: " + sumDouble);
    }


}
