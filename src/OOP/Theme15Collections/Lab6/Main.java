package OOP.Theme15Collections.Lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        MyTranslator myTranslator = new MyTranslator();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");

        for (String str : strings) {
            System.out.print(myTranslator.translate(str) + " ");
        }
    }
}
