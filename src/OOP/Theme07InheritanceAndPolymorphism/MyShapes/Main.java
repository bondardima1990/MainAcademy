package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Created by DELL on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        double sumCircleArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumArea = 0;

        Circle circle1 = new Circle("Green", 10);
        Circle circle2 = new Circle("Green", 10);

        Rectangle rectangle1 = new Rectangle("Red", 11, 22);
        Rectangle rectangle2 = new Rectangle("Red", 11, 22);
        Rectangle rectangle3 = new Rectangle("Red", 11, 22);
        Rectangle rectangle4 = new Rectangle("Red", 11, 22);
        Rectangle rectangle5 = new Rectangle("Red", 11, 22);

        Triangle triangle1 = new Triangle("Black", 5, 5, 5);
        Triangle triangle2 = new Triangle("Black", 5, 5, 5);

        Shape[] shapes = {circle1, circle2, rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, triangle1, triangle2};

        for (Shape shape: shapes) {

            if (shape instanceof Circle)
                sumCircleArea += shape.calcArea();
            if (shape instanceof Rectangle)
                sumRectArea += shape.calcArea();
            if (shape instanceof Triangle)
                sumTriangleArea += shape.calcArea();

            sumArea = sumCircleArea + sumRectArea + sumTriangleArea;

            System.out.println(shape.toString());
        }

        System.out.println("Circle total area = " + sumCircleArea);
        System.out.println("Rectangles total area = " + sumRectArea);
        System.out.println("Triangle total area = " + sumTriangleArea);
        System.out.println("Total area of all shape = " + sumArea);
    }
}
