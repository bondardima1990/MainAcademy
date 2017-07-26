package OOP.Theme17Multithreading.Lab5;

/**
 * Created by DELL on 05.04.2017.
 */
public class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (storage) {
                try {
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(storage.getCount());
            }
        }
    }
}
