package OOP.Theme05InitializationSections.Lab4;

import java.util.Arrays;

/**
 * Change MyInit class: - change initialization block to static initialization block.
 */
public class MyInit {
    static int[] arr = new int[10];
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

    }
    void printArr()
    {
        System.out.println(Arrays.toString(arr));
    }
}
