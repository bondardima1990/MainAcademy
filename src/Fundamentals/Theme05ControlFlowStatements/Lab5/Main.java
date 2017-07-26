package Fundamentals.Theme05ControlFlowStatements.Lab5;

import java.util.Scanner;

/**
 * Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n. Also compute and display the average. <p>
 * The output shall look like: <p>
 * The Sum is: 100 <p>
 * The Avg is: 10 <p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        double avg = (double) sum / n;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}
