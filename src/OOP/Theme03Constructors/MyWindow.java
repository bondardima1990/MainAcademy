package OOP.Theme03Constructors;

/**
 * Create class MyWindow with fields width (of double type), height (of double type), numberOfGlass(of int type), color(of String type), isOpen(boolean). <p>
 *
 * Create five instances of class MyWindow with different fields values. <p>
 *
 * Add method printFields() to MyWindow class that print all fields values to console. <p>
 *
 * Add to class MyWindow constructor without parameters, which will initialize class’s fields by some default values. <p>
 *
 * Create instance of class MyWindow using constructor without parameters. <p>
 *
 * Add to class MyWindow overload constructors, which will initialize class’ fields,
 * depend from what data we will put there: MyWindow(width, height), MyWindow(width, height, numberOfGlass).
 * Finally class MyWindow must have four constructors. <p>
 *
 * Change code in two overloaded constructors to invoke first constructor using this keyword. <p>
 *
 * Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors. <p>
 * Call method printFields() on each array element.
 */

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow() {
    }
    public MyWindow(double width) {
        this.width = width;
    }
    public MyWindow(double width, double height) {
        this(width);
        this.height = height;
    }
    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }
    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass, color);
        this.isOpen = isOpen;
    }

    public String printFields() {
        return "MyWindow" + '\n' +
                "width = " + width + '\n' +
                "height = " + height + '\n' +
                "numberOfGlass = " + numberOfGlass + '\n' +
                "color = " + color + '\n' +
                "isOpen = " + isOpen + '\n';
    }
}