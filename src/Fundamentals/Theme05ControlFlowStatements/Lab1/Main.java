package Fundamentals.Theme05ControlFlowStatements.Lab1;

/**
 * Write a program to produce on console the following :<p>
 * 1 <p>
 * 2 1 <p>
 * 3 2 1 <p>
 * 4 3 2 1 <p>
 * 5 4 3 2 1 <p>
 * 6 5 4 3 2 1 <p>
 * 7 6 5 4 3 2 1 <p>
 * 8 7 6 5 4 3 2 1 <p>
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
