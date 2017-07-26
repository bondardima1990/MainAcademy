package OOP.Theme14Generics.Lab4;

import java.util.Arrays;

/**
 * Created by DELL on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] stringsArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer<Integer> integerMyMixer = new MyMixer<>(integerArray);
        MyMixer<String> stringMyMixer = new MyMixer<>(stringsArray);

        Object[] integerShuffle = integerMyMixer.shuffle();
        Object[] stringShuffle = stringMyMixer.shuffle();

        for (Object i : integerShuffle) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Object s : stringShuffle) {
            System.out.print(s + " ");
        }

    }
}
