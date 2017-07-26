package OOP.Theme17Multithreading.Lab2;

/**
 * Created by DELL on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        new Thread(bomb1).start();
    }
}
