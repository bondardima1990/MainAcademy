package Fundamentals.Theme05ControlFlowStatements.Lab2;

import java.util.Scanner;

/**
 * 1. Write a program which prompts user for the number "x", reads it from the keyboard, and saves it in an int variable called "x". <p>
 *
 * 2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively. <p>
 *
 * 3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement. <p>
 *
 * 4. The output shall look like (user input – in green): <p>
 *      -Enter number x: 1 <p>
 *      -One <p>
 *      -Enter number x: 12 <p>
 *      -Other <p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = scanner.nextInt();

        if (x == 1) System.out.println("One");
        if (x == 2) System.out.println("Two");
        if (x == 3) System.out.println("Three");
        if (x == 4) System.out.println("Four");
        if (x == 5) System.out.println("Five");
        if (x == 6) System.out.println("Six");
        if (x == 7) System.out.println("Seven");
        if (x == 8) System.out.println("Eight");
        if (x == 9) System.out.println("Nine");
        if (x > 9) System.out.println("Other");

        switch (x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}
