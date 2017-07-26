package Fundamentals.Theme06Arrays.Lab1;

import java.util.Arrays;

/**
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int [15];
        int count = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0){
                array[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
