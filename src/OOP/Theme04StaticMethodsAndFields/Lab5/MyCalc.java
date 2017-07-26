package OOP.Theme04StaticMethodsAndFields.Lab5;

/**
 * The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n,
 * and computes and returns the value of π approximated to the first n terms of the series.
 */
public class MyCalc {
    public static double calcPi(int n){
        double result = 4;
        int count = 3;
        boolean operation = true;
        if (n > 1) {
            for (int i = 0; i < n; i++, count+=2) {
                if (operation){
                    result -= 4/count;
                    operation = false;
                } else {
                    result += 4/count;
                    operation = true;
                }
            }
        }
        return  result;
    }
}