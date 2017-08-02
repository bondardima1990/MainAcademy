package OOP.Theme11ExceptionsAndAssertions.Lab3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        this.age = age;
        if (this.age < 1 | this.age > 120)
            throw new InvalidAgeException();
    }

    @Override
    public String toString() {
        return "Person" +
                "firstName = " + firstName + '\n' +
                "lastName = " + lastName + '\n' +
                "age = " + age;
    }
}


