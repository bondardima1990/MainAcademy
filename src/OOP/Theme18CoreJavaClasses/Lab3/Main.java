package OOP.Theme18CoreJavaClasses.Lab3;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by DELL on 15.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        long numberLong = 2_430_000_000_000l;
        double numberDouble = 0.002d;

        Locale locale = new Locale("UA", "UA");
        System.out.println("Current Locale: " + locale.getDisplayName());

        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println("Integer: " + numberFormat.format(numberLong));
        System.out.println("Double: " + numberFormat.format(numberDouble));

        NumberFormat numberCurrency = NumberFormat.getCurrencyInstance();
        System.out.println("Currency : " + numberCurrency.format(numberLong));

        Date date = new Date();
        System.out.println("Date:" + date);

    }
}
