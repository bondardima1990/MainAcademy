package Fundamentals.Theme06Arrays.Lab6;

import java.util.Arrays;

/**
 * Write a program that sorts an array of average temperature values by months of 2015 as follows:
 * at first the negative values, then - positive values
 */
public class Main {
    public static void main(String[] args) {
        double[] averageTemperature = {-5.7, 2.0, 3.9, 12.4, 15.5, 20.6, 22.4, 21.1, 16.1, 6.5, 1.2, -1.5};
        Arrays.sort(averageTemperature);
        System.out.println(Arrays.toString(averageTemperature));
    }
}
