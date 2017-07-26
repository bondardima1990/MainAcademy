package OOP.Theme15Collections.Lab1;

import java.util.ArrayList;

/**
 * Created by DELL on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            collection.add("number_" + i);
        }

        System.out.println(collection);
    }
}
