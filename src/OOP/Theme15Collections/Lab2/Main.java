package OOP.Theme15Collections.Lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add("num_" + i);
        }

        System.out.println(linkedList);

        Collections.shuffle(linkedList);

        System.out.println(linkedList);
    }
}
