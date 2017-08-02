package OOP.Theme11ExceptionsAndAssertions.Lab5;

import static OOP.Theme10WrapperClassesForPrimitiveTypes.Lab2.Main.compute;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        assert x == y:"x != y";
        System.out.println("x = y");

        assert (compute(42.42, 142) == (float) 42.42 + (float) 142) : "\n\n> OH MY!  compute method is BROKEN! <\n";
    }
}
