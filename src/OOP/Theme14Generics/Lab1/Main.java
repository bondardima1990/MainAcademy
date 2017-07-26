package OOP.Theme14Generics.Lab1;

/**
 * Created by DELL on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("a", 2, 3l);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(3.0, "b", "c");

        System.out.println(myTuple1.toString());
        System.out.println(myTuple2.toString());
    }
}
