package OOP.Theme05InitializationSections.Lab2;

/**
 * Create class Main, which will create two instances of class MyInit and invoke method printArray()
 * to print values of their arrays on console. <p>
 * Example of output:
 * 23,43,11,34,78,59,34,61,24,2 <p>
 * 5,48,50,3,1,4,67,62,78,98 <p>
 */
public class Main {
    public static void main(String[] args) {
        MyInit a = new MyInit();
        a.printArr();
        MyInit b = new MyInit();
        b.printArr();
    }
}
