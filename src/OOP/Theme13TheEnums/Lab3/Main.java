package OOP.Theme13TheEnums.Lab3;

import OOP.Theme13TheEnums.Lab1.MyDayOfWeek;

import java.util.Scanner;

/**
 * Created by DELL on 13.03.2017.
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
