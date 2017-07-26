package OOP.Theme06Packages.Lab1.example.testpack;

import OOP.Theme06Packages.Lab1.com.brainacad.carpack.Car;
import OOP.Theme06Packages.Lab1.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMass(12.34);
        System.out.println("Car weight = " + car.getMass());

        Apple apple = new Apple();
        apple.setMass(56.78);
        System.out.println("Apple weight = " + apple.getMass());
    }
}
