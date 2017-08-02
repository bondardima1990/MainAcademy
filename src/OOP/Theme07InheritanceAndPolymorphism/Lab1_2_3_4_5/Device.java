package OOP.Theme07InheritanceAndPolymorphism.Lab1_2_3_4_5;

public class Device {
    private String manufacture;
    private float price;
    private String serialNumber;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  "Device" + '\n' +
                "manufacture = " + manufacture + '\n' +
                "price = " + price + '\n' +
                "serialNumber = " + serialNumber + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacture != null ? !manufacture.equals(device.manufacture) : device.manufacture != null) return false;
        if (serialNumber != null ? !serialNumber.equals(device.serialNumber) : device.serialNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = manufacture != null ? manufacture.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}

