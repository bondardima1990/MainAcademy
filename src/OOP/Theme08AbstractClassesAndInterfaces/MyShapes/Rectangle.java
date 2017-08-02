package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

/**
 * You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).<p>
 * Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes.<p>
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Width = " + width + '\n' +
                "Height = " + height + '\n';
    }

    /*@Override
    public void draw() {
        System.out.println(toString());
    }*/

    /*@Override
    public int compareTo(Object o) {
        Shape rect = (Shape) o;
        if (this.calcArea() > rect.calcArea()) return 1;
        if (this.calcArea() < rect.calcArea()) return -1;
        return 0;
    }*/
}
