package OOP.Theme17Multithreading.Lab6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.err.println(" The START \n");
        DiningHall diningHall = new DiningHall(20);
        diningHall.showInnerHell();
    }
}
