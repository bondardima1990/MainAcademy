package OOP.Theme04StaticMethodsAndFields.Lab1_2_3;

/**
 * Create class Calculation, which will create two arrays of integers and use findMin and findMax static methods of MyMath class.
 */
public class Calculation {
    public static void main(String[] args) {

        int[] array = {5, 10, 15, 35, 2, 56, 100, 58, 1, 93};
        System.out.println("Min is " + MyMath.findMin(array));
        System.out.println("Max is " + MyMath.findMax(array));

        System.out.println("Area of circle is " + MyMath.areaOfCircle(10.01));
    }
}
