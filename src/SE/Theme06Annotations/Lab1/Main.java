package SE.Theme06Annotations.Lab1;

/**
 * Created by DELL on 24.05.2017.
 */
public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println(findMax(20, 10, 25, 5));
    }

    @Deprecated
    private static int findMax(int... i) {
        int max = 0;
        for (int j = 0; j < i.length; j++) {
            if (max < i[j]){
                max = i[j];
            }
        }
        return max;
    }
}
