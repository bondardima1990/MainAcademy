package OOP.Theme16MethodOverloadResolution;

/**
 * Created by DELL on 25.03.2017.
 */
public class MethodResolutionTest {
    public static void main(String[] args) {
        varargTest(1, 2, 3);
        varargTest("Testing:", 10, 20);
        varargTest(true, false, false);
    }

    static void varargTest(int... no) {
        System.out.println("(int...): " + "Number of args: " + no.length + "Contents: ");
        for (int n : no) {
            System.out.print(n + " ");
            System.out.println();
        }
    }

    static void varargTest(boolean... bl) {
        System.out.println("(boolean...): " + "Number of args: " + bl.length + "Contents: ");
        for (boolean n : bl) {
            System.out.print(n + " ");
            System.out.println();
        }
    }

    static void varargTest(String msg, int... no) {
        System.out.println("(String, int...): " + msg +"Number of args: " + no.length + "Contents: ");
        for (int n : no) {
            System.out.print(n + " ");
            System.out.println();
        }
    }
}
