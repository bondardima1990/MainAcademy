package OOP.Theme17Multithreading.Lab4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by DELL on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];

        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }

        mySumCount1.setArrayInt(myArray);
        mySumCount2.setArrayInt(myArray);

        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(myArray.length);

        mySumCount2.setStartIndex(0);
        mySumCount2.setStopIndex(myArray.length);

        new Thread(mySumCount1).start();
        new Thread(mySumCount2).start();

        System.out.println("Random array:\n" + Arrays.toString(myArray));

        System.out.println("Sum of array elements for thread 1: " + mySumCount1.getResultSum());
        System.out.println("Sum of array elements for thread 2: " + mySumCount2.getResultSum());
    }
}
