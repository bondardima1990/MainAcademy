package OOP.Theme05InitializationSections.Lab2;

import java.util.Arrays;

/**
 * Create class MyInit with field arr of array of integers and non-static initialization block which will initialize
 * that array with random values (Size of array is 10). <p>
 * To generate random numbers you can use next code: <p>
 * arr[i]= (int) (100 * Math.random()). <p>
 * (Or using Random class instance and nextInt() method invocation).<p>
 * Add to class MyInit and method printArray() which will print values of this array.
 *
 */
public class MyInit {
    int[] arr = new int[10];
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

    }
    void printArr(){
        System.out.println(Arrays.toString(arr));
    }
}
