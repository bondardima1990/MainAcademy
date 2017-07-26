package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

/**
 * Created by DELL on 01.03.2017.
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

    /*@Override
    public void draw() {
        System.out.println(toString());
    }*/

    /*@Override
    public int compareTo(Object o) {
        Shape triangle = (Shape) o;
        if (this.calcArea() > triangle.calcArea()) return 1;
        if (this.calcArea() < triangle.calcArea()) return -1;
        return 0;
    }*/
}
