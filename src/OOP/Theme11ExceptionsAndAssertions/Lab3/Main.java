package OOP.Theme11ExceptionsAndAssertions.Lab3;

/**
 * Created by DELL on 11.03.2017.
 */
public class Main{
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setFirstName("FirstName");
            person.setLastName("LastName");
            person.setAge(122);
        }catch (InvalidAgeException ex){
            System.out.println("Invalid Age");
        }
    }
}
