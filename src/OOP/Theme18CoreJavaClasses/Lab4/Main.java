package OOP.Theme18CoreJavaClasses.Lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //Process notepad = Runtime.getRuntime().exec("notepad.exe");
            //Process calc = Runtime.getRuntime().exec("calc.exe");
            Process gnomeSystemMonitor = Runtime.getRuntime().exec("gnome-system-monitor");
            Process xed = Runtime.getRuntime().exec("xed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
