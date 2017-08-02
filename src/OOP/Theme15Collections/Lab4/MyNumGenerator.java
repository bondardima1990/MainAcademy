package OOP.Theme15Collections.Lab4;

import java.util.ArrayList;
import java.util.Random;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    /*public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }*/

    ArrayList<Integer> generate(int numOfElm, int maxNumb){
        Random random = new Random();
        ArrayList<Integer> integerList = new ArrayList<>();
        while (integerList.size() < numOfElm){
            integerList.add(random.nextInt(maxNumb));
        }
        System.out.println(integerList);
        return integerList;
    }

}
