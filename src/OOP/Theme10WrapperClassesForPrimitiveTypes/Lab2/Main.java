package OOP.Theme10WrapperClassesForPrimitiveTypes.Lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute(5.56, 2560));
        System.out.println(compute(125, 354.777));
    }

    public static Float compute(Number firstNumber, Number secondNumber) {
        return Float.parseFloat(firstNumber+ "") + Float.parseFloat(secondNumber + "");
    }
}
