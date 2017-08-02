package OOP.Theme08AbstractClassesAndInterfaces.MyShapes;

import OOP.Theme11ExceptionsAndAssertions.Lab4.InvalidShapeStringException;

/**
 * Rewrite the class Shape to make it abstract and change calcArea() method declaration to make it abstract too.<p>
 * Implement interface Drawable to class Shape. The classes that implements the Drawable interface will provide actual
 * implementation to these abstract method witch print characteristics of each shape on console
 * (print to console information about this object from toString() and area of this shape (using calcArea() method).<p>
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

