package OOP.Theme11ExceptionsAndAssertions.Lab2;

public class MyException extends Exception {
    String string;

    public MyException(String string) {
        this.string = string;
    }
}
