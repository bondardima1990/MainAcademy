package OOP.Theme02Methods.Lab4;

/**
 * Created by DELL on 02.02.2017.
 */
public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.person("Dima", "Bondar", 26, "male", 123_45_67);
        person1.person(26, "male");
        person1.person("Dima", "Bondar", 123_45_67);
        person1.person("Dima", "male");
        person1.person("Dima", "Bondar", 26, 777_77_77);
    }
}
