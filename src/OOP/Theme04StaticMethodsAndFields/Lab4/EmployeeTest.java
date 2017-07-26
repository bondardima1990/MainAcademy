package OOP.Theme04StaticMethodsAndFields.Lab4;

/**
 * Created by DELL on 22.02.2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setFirstName("Ivan");
        employee1.setLastName("Ivanov");
        System.out.println(employee1.getNumberOfEmployees());

        Employee employee2 = new Employee();
        employee2.setFirstName("Vasya");
        employee2.setLastName("Petrov");
        System.out.println(employee2.getNumberOfEmployees());

        Employee employee3 = new Employee();
        employee3.setFirstName("Petia");
        employee3.setLastName("Sidorov");
        System.out.println(employee3.getNumberOfEmployees());


        System.out.println(employee1.getNumberOfEmployees());
        System.out.println(employee2.getNumberOfEmployees());

    }
}
