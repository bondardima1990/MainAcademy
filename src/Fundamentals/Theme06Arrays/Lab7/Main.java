package Fundamentals.Theme06Arrays.Lab7;

/**
 * Write a program, which finds in a given matrix the area of equal numbers.
 * Here is one example with an area containing 7 elements with equal value of 1: <p>
 *
 * 1 1 1 3 4 <p>
 * 2 1 3 1 2 <p>
 * 2 2 3 4 1 <p>
 * 3 3 3 1 4 <p>
 *
 * The program must print to console: <p>
 * Line 1: [0-2] <p>
 * Line 2: [1,3] <p>
 * Line 3: [4] <p>
 * Line 4: [3] <p>
 */
public class Main {
    public static void main(String[] args) {
        int number = 1;
        int count = 1;
        int[][] array = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}};

        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + count++ + " [");
            for (int j = 0; j < array[i].length; j++) {
                if (number == array[i][j]){
                    int index = j;
                    System.out.print(" " + index);
                }
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}
