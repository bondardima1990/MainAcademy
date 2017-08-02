package OOP.Theme14Generics.Lab2_3;

/**
 * Create class MyTestMethod with generic static method calcNum (with two parameters:
 * an array T[] and variable maxElem of type T) that counts the number of elements in an array T[]
 * that are greater than a specified element maxElem.
 */
public class MyTestMethod {
    static <T extends Number> int calcNum (T[] array, T maxElem){
        int count = 0;
        for (T arr : array) {
            if(arr.doubleValue() > maxElem.doubleValue())
                count++;
        }
        return count;
    }

    static <T extends Number> double calcSum(T[] array, T maxValue){
        double sum = 0;
        for (T arr : array) {
            if (arr.doubleValue() > maxValue.doubleValue())
                sum += arr.doubleValue();
        }
        return sum;
    }
}
