package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Create class Main with method main().
 * The program must demonstrate the creation of one Shape object and print it name and color to console.
 * Then add code to invoke calcArea() method and print result to console.
 * Program output must looks like:
 * “This is Shape, color is: RED”
 * “Shape area is: 0”
 * Use MyShapes project. The program must demonstrate the creation of an array of different types of shapes
 * and print characteristics of each shape on console.<p>
 * 1. Add new code to method main() in class Main_1:<p>
 * 2. Create array (Shape[] arr) of different Shape objects, (five rectangles, two circles and two triangles);<p>
 * 3. Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on
 * console (using toString() method) with area of this shape (using calcArea() method).<p>
 * 4. Execute the program, output must looks like:<p>
 * This is Rectangle, color: RED, width=11, height=22, area is: 242<p>
 * This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825<p>
 * This is Circle, color: GREEN, radius=10, area is: 314.15926 …<p>
 * 5. Add code to calculate total area of all shape types. Define sumArea (of double type) local variable
 * and use it in loop to sum total area for all shapes.<p>
 * 6. Add code to sum total area for each shape types.<p>
 * Define sumRectArea, sumTriangleArea, sumCircleArea (of double type) local variables
 * and use it in loop to sum total area for each shape type. You should use instanceof keyword for determining,
 * total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.<p>
 * 7. Execute the program, output must looks like:<p>
 * Rectangles total area: 234.54<p>
 * Circle total area: 547.231<p>
 * Triangle total area: 356.56
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
