package Fundamentals.Theme02StartProgrammingWithJavaCreateSimpleConsoleApplication.Lab2;

import java.util.Scanner;

/**
 * 1) Creates a Scanner to read from the keyboard;<p>
 *
 * 2) Prints an invitation to enter the student's name, example: "Enter the name of the student: ";<p>
 *
 * 3) Introduces the student's name in the line-invitation, and then outputs it in next line.<p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
