package OOP.Theme13TheEnums.Lab2;

import OOP.Theme13TheEnums.Lab1.MyDayOfWeek;

/**
 * Add to method main() code that iterate over MyDayOfWeek enum possible values in loop
 * and using switch statement print to console days of the week only when you have classes in Java Programming.<p>
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
