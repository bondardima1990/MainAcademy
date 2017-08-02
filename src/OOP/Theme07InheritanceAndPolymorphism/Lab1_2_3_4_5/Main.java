package OOP.Theme07InheritanceAndPolymorphism.Lab1_2_3_4_5;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        EthernetAdapter ethernetAdapter = new EthernetAdapter();

        monitor.setManufacture("Samsung");
        monitor.setPrice(99.99f);
        monitor.setSerialNumber("AB1234567CD");
        monitor.setResolutionX(1280);
        monitor.setResolutionY(1024);

        System.out.println(monitor.equals(monitor));
        System.out.println(monitor.equals(ethernetAdapter));
        System.out.println(monitor.hashCode());

        ethernetAdapter.setManufacture("Asus");
        ethernetAdapter.setPrice(120.55f);
        ethernetAdapter.setSerialNumber("A1B2C3D4");
        ethernetAdapter.setSpeed(256);
        ethernetAdapter.setMac("01:0C:CD:01:01:21");

        System.out.println(ethernetAdapter.equals(monitor));
        System.out.println(ethernetAdapter.equals(ethernetAdapter));
        System.out.println(ethernetAdapter.hashCode());

        Device[] devices = new Device[2];
        devices[0] = monitor;
        devices[1] = ethernetAdapter;

        for (Device device: devices) {
            System.out.println(device);
        }
    }
}
