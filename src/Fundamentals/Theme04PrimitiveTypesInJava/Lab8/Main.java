package Fundamentals.Theme04PrimitiveTypesInJava.Lab8;

/**
 * Write a console program that prints result type casting for different primitive types.
 */

public class Main {
    public static void main(String[] args) {
        long l = 777_777_777_777L;
        int i = (int) l;
        short s = (short) i;

        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
    }
}
