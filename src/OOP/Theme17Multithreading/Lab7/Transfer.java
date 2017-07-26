package OOP.Theme17Multithreading.Lab7;

/**
 * Created by DELL on 06.04.2017.
 */
public class Transfer {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }
}
