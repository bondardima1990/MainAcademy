package OOP.Theme12NestedClasses.Lab1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "077-777-77-77");
        myPhoneBook.addPhoneNumber("Vova", "066-666-66-66");
        myPhoneBook.printPhoneBook();
    }
}
