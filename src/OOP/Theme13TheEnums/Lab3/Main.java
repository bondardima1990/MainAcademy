package OOP.Theme13TheEnums.Lab3;

import OOP.Theme13TheEnums.Lab1.MyDayOfWeek;

import java.util.Scanner;

/**
 * Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum value.<p>
 * For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.<p>
 * Add to method main() code that read string value from console (using System.in and Scanner),
 * then you must parse string value to particular enum value (using valueOf() method)
 * and then print the name of next day of week to console.<p>
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the day: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toUpperCase();
        scanner.close();

        System.out.println("The next day of week: " + MyDayOfWeek.valueOf(day).nextDay());

    }
}
