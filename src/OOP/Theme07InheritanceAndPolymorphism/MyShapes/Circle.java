package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Created by DELL on 21.02.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Radius = " + radius + '\n';
    }
}
