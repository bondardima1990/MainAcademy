package OOP.Theme13TheEnums.Lab1;

/**
 * Created by DELL on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek.name());
        }
    }
}
