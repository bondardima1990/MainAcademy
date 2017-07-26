package OOP.Theme11ExceptionsAndAssertions.Lab2;

/**
 * Created by DELL on 11.03.2017.
 */
public class MyException extends Exception {
    String string;

    public MyException(String string) {
        this.string = string;
    }
}
