package OOP.Theme14Generics.Lab2_3;

import static OOP.Theme14Generics.Lab2_3.MyTestMethod.calcNum;
import static OOP.Theme14Generics.Lab2_3.MyTestMethod.calcSum;

/**
 * Add to method main() code that creates two array, first – array of Integer type and second – array of Double type.
 * Fill these arrays with some random values. Add code to counts the number of elements in each of arrays
 * that are greater than a specified element by invoking calcNum() static method.
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
