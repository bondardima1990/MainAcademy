package OOP.Theme07InheritanceAndPolymorphism.MyShapes;

/**
 * Created by DELL on 21.02.2017.
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
