package OOP.Theme17Multithreading.Lab6;

public class Student extends Thread {
    private String name;
    private DiningHall diningHall;
    private int eatenPizza;

    Student(DiningHall diningHall, String sNAME) {
        this.diningHall = diningHall;
        this.name = sNAME;
    }

    @Override
    public void run() {
        while (diningHall.isBacking() || diningHall.hasPizza()) {
            synchronized (diningHall) {
                try {
                    if (!diningHall.hasPizza()) diningHall.wait();

                    if (diningHall.servePizza()) {
                        System.out.println("Student " + name + " got a pizza !");
                        eatenPizza++;
                    }
                    diningHall.notifyAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (eatenPizza == 0)
            System.out.println("Student " + name + " died..._____<\n");
        else System.err.println(name + " got " + eatenPizza + (eatenPizza > 1 ? " PIZZAS !!!" : " pizza"));
    }


}
