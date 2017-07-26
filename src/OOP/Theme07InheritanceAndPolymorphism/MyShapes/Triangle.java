package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Created by DELL on 21.02.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return  super.toString() +
                "a = " + a + '\n' +
                "b = " + b + '\n' +
                "c = " + c + '\n';
    }
}
