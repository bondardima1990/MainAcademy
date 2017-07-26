package OOP.Theme14Generics.Lab4;

import java.util.Random;

/**
 * Created by DELL on 07.03.2017.
 */
public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle(){
        T a;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }
}
