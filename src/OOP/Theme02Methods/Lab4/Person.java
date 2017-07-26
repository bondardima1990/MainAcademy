package OOP.Theme02Methods.Lab4;

/**
 * Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
 * and five overloaded methods that set this fields with different arguments list.
 * Create class that will be use instance of class Person and his methods.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void person (String firstName, String lastName, int age, String gender, int phoneNumber){
        System.out.println(firstName + " " + age + " " + gender + " " + phoneNumber);
    }

    public void person (int age, String gender){
        System.out.println(age + " " + gender);
    }

    public void person (String firstName, String lastName, int phoneNumber){
        System.out.println(firstName + " "  + lastName + " "  + phoneNumber);
    }

    public void person (String firstName, String gender){
        System.out.println(firstName + " "  + gender);
    }

    public void person (String firstName, String lastName, int age, int phoneNumber){
        System.out.println(firstName + " "  + lastName + " " + age + " " + phoneNumber);
    }
}
