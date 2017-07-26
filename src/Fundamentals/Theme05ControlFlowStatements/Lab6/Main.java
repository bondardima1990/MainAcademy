package Fundamentals.Theme05ControlFlowStatements.Lab6;

import java.util.Scanner;

/**
 * Write a program that calculates and displays the sum of squares of digits of number
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        while (x > 0){
            sum += Math.pow((x % 10), 2);
            x /= 10;
        }
        System.out.println(sum);
    }
}
