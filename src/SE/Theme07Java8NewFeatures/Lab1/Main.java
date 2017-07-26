package SE.Theme07Java8NewFeatures.Lab1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 1) Create a class Main with a main() method, which creates array of Integer type and fills it with random values.
 *      Add in a main() method of the sorting code an array of integer values in descending order,
 *      using lambda expressions to specify the sort order.<p>
 *
 * 2) Add in a main() method code that creates a list of strings and sorts it in the reverse alphabetical order.
 *      Using lambda expressions to specify the sort order.
 *
 */

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Random: " + Arrays.toString(array));

        List arrayList = Stream.of(array)
                .sorted((x, y) -> Integer.compare(y, x))
                .collect(Collectors.toList());

        System.out.println("Sorted: " + arrayList);

        System.out.println();


        List<String> listStrings = new LinkedList<>();
        listStrings.add("xyz");
        listStrings.add("bb");
        listStrings.add("e");
        listStrings.add("ggg");
        listStrings.add("zzzzzzzzz");
        listStrings.add("ddddd");
        listStrings.add("aaa");
        listStrings.add("abcd");

        System.out.println("Random: " + listStrings);

        Collections.sort(listStrings);
        Collections.reverse(listStrings);

        System.out.println("Sorted: " + listStrings);

    }
}
