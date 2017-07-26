package Fundamentals.Theme06Arrays.Lab3;

/**
 * Write a program, which creates square matrix like those in the figure below and prints them formatted to the console. <p>
 * The size of the matrix is 4 x 4: <p>
 * 1 5  9 13 <p>
 * 2 6 10 14 <p>
 * 3 7 11 15 <p>
 * 4 8 12 16 <p>
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
                System.out.printf("%4d", array[j][i]);
            }
            System.out.println();
        }
    }
}
