package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Created by DELL on 21.02.2017.
 */
public class Rectangle extends Shape{
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
}
