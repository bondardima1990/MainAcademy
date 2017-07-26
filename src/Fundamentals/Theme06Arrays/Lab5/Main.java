package Fundamentals.Theme06Arrays.Lab5;

/**
 * Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the console
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
