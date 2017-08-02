package OOP.Theme18CoreJavaClasses.Lab1;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        BigInteger number = BigInteger.valueOf(random.nextInt(40) + 10);
        BigInteger f = new BigInteger(String.valueOf(number));
        System.out.println(number + "! = " + factorial(f));

    }

    static BigInteger factorial(BigInteger f){
        if (f.equals(BigInteger.ONE)) return f;
        return f.multiply(factorial(f.subtract(BigInteger.ONE)));
    }
}
