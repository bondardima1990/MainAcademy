package OOP.Theme17Multithreading.Lab3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = new int[1000];

        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();

        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(1000);
        }
        mySumCount1.setArrInt(arrInt);
        mySumCount2.setArrInt(arrInt);

        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(arrInt.length);

        mySumCount2.setStartIndex(0);
        mySumCount2.setStopIndex(arrInt.length);

        mySumCount1.run();
        mySumCount2.run();

        System.out.println("Random array:\n" + Arrays.toString(arrInt));

        System.out.println("Sum of array elements for thread 1: " + mySumCount1.getResultSum());
        System.out.println("Sum of array elements for thread 2: " + mySumCount2.getResultSum());
    }
}
