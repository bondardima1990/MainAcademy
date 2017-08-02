package OOP.Theme18CoreJavaClasses.Lab2;

/**
 * How many nails we will buy for 1 dollar, if the first costs $ 0.1 and each next $ 0.1 more expensive?
 */

public class Main {
    public static void main(String[] args) {
        double oneDollar = 1d;
        double step = 0.1d;

        System.out.println("We have " + oneDollar + " dollar");

        int nailsCount = getNailsCount(oneDollar, step);

        System.out.println("Total nails purchased: " + nailsCount);
    }

    private static int getNailsCount(double moneyCount, final double stepRange) {
        if (moneyCount - stepRange <= 0) return 0;

        double step = stepRange;
        double remainder = moneyCount;
        int count = 0;

        for (double i = 0; i <= moneyCount; i += step) {
            System.out.printf("%-15s %4.1f %n", "Value = ", step);
            remainder = remainder - step;
            System.out.printf("%-15s %4.1f %n", "Remainder = ", remainder);
            System.out.println("________________________");
            step = step + stepRange;
            count++;
        }
        return count;
    }
}