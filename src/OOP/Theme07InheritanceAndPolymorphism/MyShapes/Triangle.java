package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Add to project MyShapes a new class Triangle which is a subclass of Shape.
 * Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
 * In class Triangle override calcArea() method which must return area of triangle.
 * In class Triangle override the toString() method.
 * It must return string which contain name of shape, color and a, b, c sides of triangle.
 * Example: “This is Triangle, color: BLACK, a=5, b=5, c=5”
 * Add to class Triangle constructor with color, a, b and c arguments.
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
