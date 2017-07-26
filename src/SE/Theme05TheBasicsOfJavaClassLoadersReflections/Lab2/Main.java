package SE.Theme05TheBasicsOfJavaClassLoadersReflections.Lab2;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by DELL on 18.05.2017.
 */
public class Main {

    private char value[] = {'z', 'x', 'c', 'v'};

    public static void main(String[] args) {

        String myStr = "abcd";
        Main main = new Main();
        System.out.println("Old string value: " + Arrays.toString(main.value));
        Class clss = main.getClass();

        try {
            Field field = clss.getDeclaredField("value");
            field.setAccessible(true);
            field.set(main, myStr.toCharArray());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("New string value: " + Arrays.toString(main.value));
        System.out.println("abcd");
    }
}