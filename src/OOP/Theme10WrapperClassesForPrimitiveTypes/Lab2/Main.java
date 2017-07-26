package OOP.Theme10WrapperClassesForPrimitiveTypes.Lab2;

/**
 * Created by DELL on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(compute((byte) 5, 2560));
        System.out.println(compute(125, 354));
    }

    static Long compute(Byte b, Integer i){
        return Long.valueOf(b + i);
    }

    static Integer compute(Integer i1, Integer i2){
        return i1 + i2;
    }
}
