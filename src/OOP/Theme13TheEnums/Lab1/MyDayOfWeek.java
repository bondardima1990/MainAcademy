package OOP.Theme13TheEnums.Lab1;

/**
 * Created by DELL on 02.03.2017.
 */
public enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public MyDayOfWeek nextDay(){
        MyDayOfWeek[] myDayOfWeeks = MyDayOfWeek.values();
        int ordinal = this.ordinal();
        return ++ordinal == myDayOfWeeks.length ? SUNDAY : myDayOfWeeks[ordinal];
    }
}
