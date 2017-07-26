package Fundamentals.Theme05ControlFlowStatements.Lab4;

/**
 * The program must print the first 10 numbers that is divisible evenly by 3 or 4,
 * but for loop iterates from 1 to 300 (so break statement must be used after 10 printed result). <p>
 * The output shall look: <p>
 * 3 <p>
 * 4 <p>
 * … <p>
 * 20 <p>
 */

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 | i % 4 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 10) break;
        }
    }
}
