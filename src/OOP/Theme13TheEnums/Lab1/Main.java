package OOP.Theme13TheEnums.Lab1;

/**
 * Create a class Main with a main().<p>
 * Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).<p>
 * Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and print each value name to console.<p>
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek.name());
        }
    }
}
