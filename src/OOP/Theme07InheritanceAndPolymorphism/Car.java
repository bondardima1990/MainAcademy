package OOP.Theme07InheritanceAndPolymorphism;

public class Car {
    public String name = "Car am i ?";
    public int madeWhen = 1980;

static class SportCar extends Car {
    public boolean isSport = true;

    {
        super.name = "Porshe";  //можна так         но лутше так
        madeWhen = 2017;        //а можна и так
    }
}

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.madeWhen);
        System.out.println(car.name);

        SportCar sportCar = new SportCar();
        System.out.println(sportCar.madeWhen);
        System.out.println(sportCar.name);
        System.out.println("is Sport = " + sportCar.isSport);

        Car carTest = new SportCar();

        System.out.println(carTest.madeWhen);
        System.out.println(carTest.name);
        //System.out.println("is Sport = " + carTest.isSport);

        //SportCar sportCarTest = new Car();
        SportCar sportCarTest = (SportCar) new Car();

    }
}
