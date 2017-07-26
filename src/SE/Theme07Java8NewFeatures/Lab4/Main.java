package SE.Theme07Java8NewFeatures.Lab4;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1) Create a class Main with a main() method, which:
 *      - create and output a list of integers using Stream functions:
 *          create an infinite stream of integers, starting at 10 and increasing every next on 10,
 *          then restrict it 10 the first elements, which are then halved and collect the list;
 *      - create a list of strings of 10 elements and then using the Stream, select, sort and print the lines starting with some a symbol.
 *
 * 2) Create a class Person with private fields: name, age and gender, as well as getter and setter methods, and constructor, and overridden a toString() method.
 *    Add in a main() method to create a collection of objects of type Person.
 *    Then using Stream, select and print to the console all military men (from 18 to 27 years old).
 *
 * 3) Determine for list objects of Person type the average age of women with using Stream.a collection of objects of type Person
 *
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Stream.iterate(10, n -> n + 10)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbers + "\n");


        Stream<String> inputStrings = Stream.of("zzz", "CBA", "abc", "aaa", "ABC", "AAA", "cba", "azaz", "xyz", "a");

        List<String> outputStrings = inputStrings
                .sorted()
                .filter(s -> s.startsWith("a") | s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(outputStrings + "\n");



        Collection<Person> personCollection = new LinkedList<>();

        personCollection.add(new Person("Dima", 26, "male"));
        personCollection.add(new Person("Inna", 17, "female"));
        personCollection.add(new Person("Ira", 22, "female"));
        personCollection.add(new Person("Max", 27, "male"));
        personCollection.add(new Person("Petro", 20, "male"));

        System.out.println("All persons: " + personCollection + '\n');

        List militaryMen = personCollection
                .stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() < 27 && p.getGender().equals("male"))
                .collect(Collectors.toList());

        System.out.println("Military Men: " + militaryMen + '\n');

        Double averageAgeWomen = personCollection
                .stream()
                .filter(p -> p.getGender().equals("female"))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println("Average age of women = " + averageAgeWomen + " age");
    }
}


class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name = " + name +
                " age = " + age +
                " gender = " + gender;
    }
}
