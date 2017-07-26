package OOP.Theme04StaticMethodsAndFields.Lab4;

/**
 * Create Employee class with fields firstName, lastName, occupation, telephone and static field numberOfEmployees and getters/setters.
 * Class must have constructor, which will initialize class fields and increment numberOfEmployees.
 * Create multiple instances of Employee class and the output numberOfEmployees field to the console.<p>
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    private static int numberOfEmployees;

    public Employee(){numberOfEmployees++;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    //public void setNumberOfEmployees(int numberOfEmployees) {
      //  numberOfEmployees++;
   // }
}

