package Fundamentals.Theme06Arrays.Lab2;

/**
 * There are statistics for the year by months as an array:
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array, the minimum value and the average.
 */
public class Main {
    public static void main(String[] args) {
        int [] m = new int [] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0];
        int min = m[0];
        float avg = 0;

        for (int i = 0; i < m.length; i++) {
            if (max < m[i]) max = m[i];
            if (min > m[i]) min = m[i];
            avg += m[i];
        }

        avg = avg / m.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}
