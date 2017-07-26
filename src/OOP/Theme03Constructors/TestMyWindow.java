package OOP.Theme03Constructors;

/**
 * Created by DELL on 09.02.2017.
 */
public class TestMyWindow {
    public static void main(String[] args) {
        
        MyWindow[] myWindows = new MyWindow[6];
        
        myWindows[0] = new MyWindow();
        myWindows[1] = new MyWindow(100);
        myWindows[2] = new MyWindow(200, 300);
        myWindows[3] = new MyWindow(123, 456, 3);
        myWindows[4] = new MyWindow(111, 777, 4, "red");
        myWindows[5] = new MyWindow(945, 62, 5, "green", true);

        for (MyWindow window: myWindows) {
            System.out.println(window.printFields());
        }
    }
}
