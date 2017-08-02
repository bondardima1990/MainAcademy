package OOP.Theme14Generics.Lab1;

/**
 * Create a class Main with a main() method.
 * Add to method main() code that creates two objects of MyTuple.
 * The first must be parameterized with next types: String, Integer, Long.
 * The second must be parameterized with next types: Double, String, String.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("a", 2, 3l);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(3.0, "b", "c");

        System.out.println(myTuple1.toString());
        System.out.println(myTuple2.toString());
    }
}
