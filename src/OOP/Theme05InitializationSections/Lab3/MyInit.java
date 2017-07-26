package OOP.Theme05InitializationSections.Lab3;

import java.util.Arrays;

/**
 * Change MyInit class: - change MyInit field arr to static field.
 */
public class MyInit {
    static int[] arr = new int[10];
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

    }
    void printArr()
    {
        System.out.println(Arrays.toString(arr));
    }
}
