package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

/**
 * You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).<p>
 * Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes.<p>
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

    /*@Override
    public void draw() {
        System.out.println(toString());
    }*/

    /*@Override
    public int compareTo(Object o) {
        Shape circle = (Shape) o;
        if (this.calcArea() > circle.calcArea()) return 1;
        if (this.calcArea() < circle.calcArea()) return -1;
        return 0;
    }*/
}
