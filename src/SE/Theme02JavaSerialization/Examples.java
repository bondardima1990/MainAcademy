package SE.Theme02JavaSerialization;

import java.io.*;

/**
 * Created by DELL on 25.03.2017.
 */
public class Examples {

public static class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int age;

    public Student(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        System.out.println("Constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}

    public static void main(String[] args) throws Exception {

        File file = new File("D:\\student.ser");
        file.createNewFile();


        Student s = new Student("Sasha", "Petrov", 22);
        FileOutputStream fos = new FileOutputStream("D:\\student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            oos.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        Student s2;
        FileInputStream fis = new FileInputStream("D:\\student.ser");
        ObjectInputStream oin = new ObjectInputStream(fis);
        try {
            s2 = (Student) oin.readObject();
            System.out.println("FirstName: " + s2.getFirstName());
            System.out.println("LastName: " + s2.getLastName());
            System.out.println("Age: " + s2.getAge());
        } finally {
            oin.close();
        }
    }
}





