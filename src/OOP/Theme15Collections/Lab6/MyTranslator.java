package OOP.Theme15Collections.Lab6;

import java.util.HashMap;

/**
 * Created by DELL on 23.03.2017.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();

    public HashMap<String, String> addNewWord(String en, String ru){
        dictionary.put(en, ru);
        return dictionary;
    }

    public String translate(String en){
        return dictionary.get(en);
    }
}
