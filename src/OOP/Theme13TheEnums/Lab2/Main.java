package OOP.Theme13TheEnums.Lab2;

import OOP.Theme13TheEnums.Lab1.MyDayOfWeek;

/**
 * Created by DELL on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            printJavaDay(day);
        }
    }

    private static void printJavaDay(MyDayOfWeek day) {
        switch (day){
            case TUESDAY:
                System.out.println("My Java day: TUESDAY");
                break;
            case THURSDAY:
                System.out.println("My Java day: THURSDAY");
                break;
            case SATURDAY:
                System.out.println("My Java day: SATURDAY");
                break;
        }
    }
}
