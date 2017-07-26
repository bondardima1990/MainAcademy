package OOP.Theme04StaticMethodsAndFields.Lab6;

/**
 * Write a class MyPyramid with public static method printPyramid(int h) that takes parameter an integer h between 1 and 9,
 * and prints a pyramid of numbers of height h.
 * Example: For h = 4 the method should print the pyramid <p>
 *    1 <p>
 *   121 <p>
 *  12321 <p>
 * 1234321 <p>
 */
public class MyPyramid {
    public static void printPyramid(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = (h-1); j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = (i-1); k >= -(i-1); k--){
                System.out.print(i-Math.abs(k));
            }
            System.out.println();
        }
    }
}
