package OOP.Theme12NestedClasses.Lab1;

import java.util.Arrays;

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

    public PhoneNumber[] phoneNumber = new PhoneNumber[0];

    public void addPhoneNumber(String name, String phone){
        phoneNumber = Arrays.copyOf(phoneNumber, phoneNumber.length + 1);
        phoneNumber[phoneNumber.length - 1] = new PhoneNumber(name, phone);
    }

    public void printPhoneBook(){
        for (PhoneNumber phoneNumber : phoneNumber) {
            System.out.println(phoneNumber.toString());
        }
    }
}