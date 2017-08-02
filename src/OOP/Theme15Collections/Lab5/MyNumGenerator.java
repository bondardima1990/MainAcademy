package OOP.Theme15Collections.Lab5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    Set<Integer> generateDistinct(int numOfElm, int maxNumb){
        Random random = new Random();
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size() < numOfElm)
            integerSet.add(random.nextInt(maxNumb));
        System.out.println(integerSet);
        return integerSet;
    }
}
