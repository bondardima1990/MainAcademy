package OOP.Theme02Methods.Lab3;

/**
 * Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 * This method should calculate total salary of employee and print his name and total salary.
 */
public class Employee {
    public void calcSalary(String name, double... varargsSalary){
        double sum = 0;
        for (double x: varargsSalary) {
            sum += x;
        }
        System.out.println(name + " " + sum);
    }
}
