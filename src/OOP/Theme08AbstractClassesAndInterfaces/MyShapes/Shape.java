package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

import OOP.Theme11ExceptionsAndAssertions.Lab4.InvalidShapeStringException;

import java.util.Comparator;

/**
 * Created by DELL on 01.03.2017.
 */
public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    public static Shape parseShape (String string) throws InvalidShapeStringException {
        String[] split = string.split(" ");
        switch (split[0].toLowerCase()){
            case ("circle"):
                return new Circle(split[1], Double.parseDouble(split[2]));
            case ("rectangle"):
                return new Rectangle(split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]));
            case ("triangle"):
                return new Triangle(split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4]));
            default:
                throw new InvalidShapeStringException();
                /*System.out.println("Please enter the correct parametres of shape");
                return new Shape("") {
                    @Override
                    public double calcArea() {
                        return 0;
                    }
                };*/
        }
    }

    @Override
    public String toString() {
        return "Shape Name = " + getClass().getSimpleName() + '\n' +
                "Shape Color = " + getShapeColor() + '\n' +
                "Area = " + calcArea() + '\n';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (this.calcArea() > shape.calcArea()) return 1;
        if (this.calcArea() < shape.calcArea()) return -1;
        return 0;
    }

}

