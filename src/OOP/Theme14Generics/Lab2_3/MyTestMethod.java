package OOP.Theme14Generics.Lab2_3;

/**
 * Created by DELL on 07.03.2017.
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
