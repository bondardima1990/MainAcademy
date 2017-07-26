package SE.Theme09TheProxyClasses.Lab1;

public class CalculateImpl implements Calculate {

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }
}
