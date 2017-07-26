package OOP.Theme02Methods.Lab5;

import static java.lang.Math.PI;

/**
 * Write class A with overridden methods calcSquare that calculate square of rectangle,
 * square of foursquare and square of circle and print result.
 * Write class that will use these methods.<p>
 *
 * Write class with method that will take final integer and assign to it the square of this integer and print result.
 * What will you get? Explain result.
 */
public class A {
    private int a;
    private int b;
    private double r;
    private double pi;

    public int calcSquare(int a, int b) {
        return a * b;
    }

    public int calcSquare(int a) {
        return a * a;
    }

    public double calcSquare(double r) {
        return PI * r * r;
    }

}
