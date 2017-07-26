package OOP.Theme17Multithreading.Lab5;

/**
 * Created by DELL on 05.04.2017.
 */
public class Counter extends Thread {
    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (storage) {
                storage.setCount(i);
                storage.notifyAll();
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
