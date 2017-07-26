package SE.Theme07Java8NewFeatures.Lab2;

import java.util.function.Predicate;

/**
 * 1) Add in a Main class a sumEven() static method that takes two parameters:
 *    the first - an array of integers, and the second - the predicate of Predicate<Integer> type for selecting numbers.
 *
 * 2) Add in a main() method code that invokes sumEven() method
 *    and in the form of a lambda expression specifies the selection condition the values of the array elements.
 *
 * 3) Add in a Main class a printJStr() static method that takes two parameters:
 *    the first - an list of strings, and the second - the predicate of Predicate<String> type
 *    for the selection of strings beginning with a given letter.
 *
 * 4) Add in a main() method code that invokes printJStr() method and in the form of a lambda expression specifies
 *    the selection condition the strings.
 */

public class Main {
    public static void main(String[] args) {

    }

    static int sumEven(Integer[] integers, Predicate<? super Number> predicate){
        return 0;
    }
}
