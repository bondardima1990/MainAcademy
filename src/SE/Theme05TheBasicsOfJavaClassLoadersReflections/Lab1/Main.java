package SE.Theme05TheBasicsOfJavaClassLoadersReflections.Lab1;

import java.lang.reflect.*;

/**
 * Created by DELL on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        Class clss = c.getClass();
        //Class clss = MyClass.class;
        //Class clss = Class.forName("SE.Theme05TheBasicsOfJavaClassLoadersReflections.Lab1_2.MyClass");

        System.out.println("Class name: " + clss.getName());
        System.out.println("Class Simple name: " + clss.getSimpleName());

        System.out.println("\nModifiers:");
        System.out.println(Modifier.toString(clss.getModifiers()));

        System.out.println("\nPublic fields:");
        Field[] fieldsPublic = clss.getFields();
        for (Field field : fieldsPublic){
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType());
        }

        System.out.println("\nAll fields:");
        Field[] fieldsAll = clss.getDeclaredFields();
        for (Field field : fieldsAll){
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType());
            System.out.println();
        }

        System.out.println("\nConstructors:");
        int i = 0;
        Constructor[] constructors = clss.getConstructors();
        for (Constructor constructor : constructors){
            System.out.print("\tConstructor" + (i++) + " : ");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.print(parameter.getType() + " ");
            }
            System.out.println();
        }

        System.out.print("\nMethods:");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println();
            System.out.println("\tName: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println("\tParametr types: " + parameter.getType().getName());

            }
        }
    }
}

final class MyClass{
    public int a;
    private int b;
    protected int c;
    int d;

    public MyClass() {
    }


    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int a, int b) {
        this(a);
        this.b = b;
    }

    public MyClass(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public MyClass(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
