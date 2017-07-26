package OOP.Theme04StaticMethodsAndFields.Lab7;

/**
 * Write a program that computes the distance an object will fall in Earth's gravity.
 * Create a new class called GravityCalculator with method calcDist(double time) that takes double time, and returns the position of an object after falling for time seconds (outputting the position in meters).
 * The formula in Math notation is: <p>
 * x(t) = 0.5 × a × time 2 + vi × time + xi <p>
 * Where: <p>
 * a - Acceleration (m/s2 ) = -9.81 <p>
 * t - Time (s) (for example t = 10) <p>
 * vi - Initial velocity (m/s) = 0 <p>
 * xi - Initial position = 0 <p>
 * Declare acceleration value field as a constant; <p>
 */
public class GravityCalculator {
    public static double calcDist(double time){
        final double a = -9.81;
        double vi = 0;
        double xi = 0;

        return 0.5 * a * time * time + vi * time + xi;

    }
}
