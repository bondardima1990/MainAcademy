package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * You should design a super class Shape, which defines the public method of all the shapes called calcArea(),
 * which returns the area (double type) of that particular shape. (Our program uses many kinds of shapes,
 * such as triangle, rectangle and so on.) Define a Shape class as:
 * public class Shape {
 *  declare private instance variable shapeColor of String type
 *  create a constructor for Shape with shapeColor parameter
 *  Override toString() to return the string of Shape name and color, example: “Shape, color is: RED”
 *  All shapes must has a method called calcArea(), write public method (empty) calcArea() that returns double value ( 0.0 ) . }
 */

public class Shape {
    private String shapeColor;
    private double area;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public double calcArea(){
        return area;
    }

    @Override
    public String toString() {
        return  "Shape Name = " + getClass().getSimpleName() + '\n' +
                "Shape Color = " + getShapeColor() + '\n' +
                "Area = " + calcArea() + '\n';
    }
}
