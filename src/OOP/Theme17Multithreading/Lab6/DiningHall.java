package OOP.Theme17Multithreading.Lab6;

import java.util.concurrent.atomic.AtomicInteger;

public class DiningHall extends Thread {
    private boolean backing = true;
    private static AtomicInteger pizzaNum = new AtomicInteger(0);
    private final int pizzasCount;
    private final int studentsCount;

    DiningHall(int studentsCount) {
        this.studentsCount = studentsCount;
        this.pizzasCount = (int) (studentsCount * 0.7);
        System.err.println("studentsCount = " + studentsCount);
        System.err.println("pizzasCount = " + pizzasCount);
        System.err.println("\n__________________________________________________________>>");
    }

    @Override
    public void run() {
        try {
            System.err.println("DiningHall -> makePizza()\n__________________________________________________________>>");
            makePizza();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makePizza() throws InterruptedException {
        Thread.sleep(77);
        for (int i = 0; i <= pizzasCount; i++) {
            System.out.println("pizza - " + i);
            synchronized (this) {
                pizzaNum.incrementAndGet();
                Thread.sleep(77);
                this.notifyAll();
            }
            Thread.sleep(77);
        }
        System.err.println("_____________________________<-end Of backing->____________________________________________");
        backing = false;
    }

    boolean isBacking() {
        return backing;
    }

    boolean hasPizza() {
        return pizzaNum.get() > 0;
    }

    boolean servePizza() {
        return hasPizza() && pizzaNum.decrementAndGet() >= 0;
    }

    void showInnerHell() throws InterruptedException {
        new Thread(this).start();
        for (int i = 1; i <= studentsCount; i++) {
            new Student(this, " - " + i).start();
        }
    }
}
