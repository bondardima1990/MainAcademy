package SE.Theme02JavaSerialization.Lab5;

import java.io.*;

/**
 * Created by DELL on 22.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        User user1 = new User("Dima","Bondar",26);
        User user2 = new User("Ivan","Ivanov",50);
        User user3 = new User("Petia","Petrov",20);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("userfile.ser"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("userfile.ser"))) {


//            Почему через цикл не пишет?
//            for (int i = 0; i < users.length; i++) {
//                objectOutputStream.writeObject(users[i]);
//            }

            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);
            objectOutputStream.writeObject(user3);

            objectOutputStream.flush();

            for (int i = 0; i < users.length; i++) {
                System.out.println(objectInputStream.readObject());
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
