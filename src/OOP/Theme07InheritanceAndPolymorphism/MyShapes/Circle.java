package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Add to project MyShapes a new class Circle which is a subclass of Shape.
 * Add to class Circle a private field radius (of double type).
 * In class Circle override calcArea() method which must return area of circle (by the formula: area = PI*radius2).
 * In class Circle override the toString() method. It must return string which contain name of shape, color and radius of circle.
 * Example: “This is Circle, color: GREEN, radius=22” Add to class Circle constructor with color and radius arguments.
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
