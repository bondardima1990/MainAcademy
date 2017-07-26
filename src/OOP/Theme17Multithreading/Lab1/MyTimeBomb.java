package OOP.Theme17Multithreading.Lab1;

/**
 * Created by DELL on 28.03.2017.
 */
public class MyTimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
