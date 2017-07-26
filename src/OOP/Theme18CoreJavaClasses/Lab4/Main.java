package OOP.Theme18CoreJavaClasses.Lab4;

import java.io.IOException;

/**
 * Created by DELL on 15.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Process notepad = Runtime.getRuntime().exec("notepad.exe");
            Process calc = Runtime.getRuntime().exec("calc.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
