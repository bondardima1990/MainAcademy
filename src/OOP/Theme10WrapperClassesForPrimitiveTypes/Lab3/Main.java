package OOP.Theme10WrapperClassesForPrimitiveTypes.Lab3;

import OOP.Theme08AbstractClassesAndInterfaces.MyShapes.Shape;
import OOP.Theme11ExceptionsAndAssertions.Lab4.InvalidShapeStringException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Please enter the parametres of shape: ");
        //Shape shape = Shape.parseShape(bufferedReader.readLine());

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number of forms");
        Shape[] shapes = new Shape[number.nextInt()];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the parametres of shape:");

        for (int i = 0; i < shapes.length ; i++) {
            try {
                shapes[i] = Shape.parseShape(scanner.nextLine());
            }catch (InvalidShapeStringException e){
                System.out.println("Invalid Shape");
            }
        }
        number.close();
        scanner.close();


        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
}
