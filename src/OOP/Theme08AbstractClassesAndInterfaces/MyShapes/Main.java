package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create two different Rectangle instances and compare it to each other. Print result to console.<p>
 * Add code to main() method in class Main_1 to create array (Rectangle[] arr2) of six Rectangle objects
 * and sort it using Arrays.sort() method. Add code to main() method in class Main_1
 * to iterate over Rectangles array in loop (use for-each loop) and invoke draw() method.<p>
 * Execute the program, output must looks like:<p>
 * This is Rectangle, color: RED, width=10, height=10, area is: 100<p>
 * This is Rectangle, color: RED, width=11, height=22, area is: 242<p>
 * This is Rectangle, color: RED, width=100, height=5, area is: 500<p>
 * Create an array of different shapes (size 10) and sorted in lexicographical order by color name.<p>
 * Print result to console.<p>
 */
public class Main {
    public static void main(String[] args) {

        double sumCircleArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumArea = 0;

        Circle circle1 = new Circle("Red", 100);
        Circle circle2 = new Circle("Red", 10);
        Circle circle3 = new Circle("Black", 10);
        Circle circle4 = new Circle("Green", 10);

        Rectangle rectangle1 = new Rectangle("Black", 110, 220);
        Rectangle rectangle2 = new Rectangle("Black", 11, 22);
        Rectangle rectangle3 = new Rectangle("Red", 11, 22);
        Rectangle rectangle4 = new Rectangle("White", 11, 22);

        Triangle triangle1 = new Triangle("Orange", 5, 5, 5);
        Triangle triangle2 = new Triangle("Yellow", 50, 50, 50);
        Triangle triangle3 = new Triangle("Yellow", 5, 5, 5);
        Triangle triangle4 = new Triangle("Black", 5, 5, 5);

        Shape[] shapes = {circle1, circle2, circle3, circle4,
                          rectangle1, rectangle2, rectangle3, rectangle4,
                          triangle1, triangle2, triangle3, triangle4};

        for (Shape shape: shapes) {

            if (shape instanceof Circle)
                sumCircleArea += shape.calcArea();
            if (shape instanceof Rectangle)
                sumRectArea += shape.calcArea();
            if (shape instanceof Triangle)
                sumTriangleArea += shape.calcArea();

            sumArea = sumCircleArea + sumRectArea + sumTriangleArea;

            //shape.draw();
        }

        System.out.println("Circle total area = " + sumCircleArea);
        System.out.println("Rectangles total area = " + sumRectArea);
        System.out.println("Triangle total area = " + sumTriangleArea);
        System.out.println("Total area of all shape = " + sumArea);

        System.out.println("---------------------------------------------------------------------------");

        /*System.out.println("Sort by Comparable" + '\n');

        Arrays.sort(shapes);

        for (Shape shapeSort: shapes) {
            System.out.println(shapeSort);
        }*/

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Sort by Comparator" + '\n');

        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.calcArea() > o2.calcArea()) return 1;
                if (o1.calcArea() < o2.calcArea()) return -1;
                return o1.getShapeColor().compareTo(o2.getShapeColor());
            }
        });

        for (Shape shapeSort: shapes) {
            System.out.println(shapeSort);
        }

    }
}
