package SE.Theme02JavaSerialization.Lab1_2_3;

import java.io.*;

/**
 * Created by DELL on 21.04.2017.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Dima", "Vinnitsa", 1, 1);

        employeeSerialize(employee);

        employeeDeSerialize(employee);
    }


    public static void employeeSerialize(Employee employee) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            objectOutputStream.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void employeeDeSerialize(Employee employee) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.ser"))) {

            employee = (Employee) objectInputStream.readObject();

            System.out.println(employee.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
