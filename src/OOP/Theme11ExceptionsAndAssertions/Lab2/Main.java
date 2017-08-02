package OOP.Theme11ExceptionsAndAssertions.Lab2;

import static OOP.Theme11ExceptionsAndAssertions.Lab2.MyTest.test;

public class Main {
    public static void main(String[] args) throws MyException {
        try {
            test();
        }catch (MyException e){
            System.out.println("Exception");
        }
    }
}
