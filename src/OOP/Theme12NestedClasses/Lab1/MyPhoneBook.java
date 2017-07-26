package OOP.Theme12NestedClasses.Lab1;

/**
 * Created by DELL on 11.03.2017.
 */
public class MyPhoneBook {

    public static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return  "Name = " + name + ' ' +
                    ", phone = " + phone + ' ';
        }
    }

    private PhoneNumber[] phoneNumber = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone){
        for (int i = 0; i < phoneNumber.length; i++) {
            phoneNumber[i] = new PhoneNumber(name, phone);
        }
    }

    public void printPhoneBook(){
        for (PhoneNumber phoneNumber : phoneNumber) {
            System.out.println(phoneNumber.toString());
        }
    }

}
