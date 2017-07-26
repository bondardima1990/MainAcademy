package Fundamentals.Theme06Arrays.Lab4;

import java.util.Arrays;

/**
 * Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 3;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, search));
    }
}
