package OOP.Theme17Multithreading.Lab5;

/**
 * Created by DELL on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();

    }
}
