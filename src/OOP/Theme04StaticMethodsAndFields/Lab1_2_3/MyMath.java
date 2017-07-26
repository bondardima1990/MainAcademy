package OOP.Theme04StaticMethodsAndFields.Lab1_2_3;

/**
 * Create class MyMath with two static methods (findMin and findMax),
 * which will take array of int values as argument and return minimum element value (for findMin method) or maximum element value (for findMax method). <p>
 *
 * Add to class MyMath final static field PI = 3.14 and static method areaOfCircle(),
 * which will take radius, use constant PI and calculate area. <p>
 */
public class MyMath {

    final static double PI = 3.14;

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    static double areaOfCircle(double r){
        return PI * r * r;
    }
}