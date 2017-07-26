package OOP.Theme02Methods.Lab3;

/**
 * Write class Accountant that will be create Employee instance and use his method with a different number of data.
 */
public class Accountant {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.calcSalary("Dima", 123.56, 1278.92, 1515);

        Employee employee2 = new Employee();
        employee2.calcSalary("Vasya", 1000.11, 56, 56.48, 5616.45);
    }
}
