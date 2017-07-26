package Fundamentals.Theme04PrimitiveTypesInJava.Lab3;

/**
 * Write a console program that prints result of each of arithmetic logical (AND, OR, NOT, XOR) for two variables of boolean data type.
 */

public class Main {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(!b1);
        System.out.println(b1 ^ b2);
    }
}
