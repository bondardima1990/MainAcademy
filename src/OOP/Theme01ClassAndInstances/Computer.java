package OOP.Theme01ClassAndInstances;

/**
 * Write Computer class, the attributes of this class is manufacturer (of String type), serialNumber (of int type),
 * price (of float type), quantityCPU (of int type) and frequencyCPU (of int type).<p>
 *
 * The fields Computer class need to be encapsulated.
 * Add to Computer class getters and setters methods. Use correct access modifiers. <p>
 *
 * Add to class Computer method void view(){} that prints all fields of object in line.
 * Print all info (fields) of all objects in console.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int freqencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFreqencyCPU() {
        return freqencyCPU;
    }

    public void setFreqencyCPU(int freqencyCPU) {
        this.freqencyCPU = freqencyCPU;
    }

    public void view() {
        System.out.println("manufacturer=" + manufacturer +
                "\nserialNumber=" + serialNumber +
                "\nprice=" + price +
                "\nquantityCPU=" + quantityCPU +
                "\nfreqencyCPU=" + freqencyCPU + "\n");
    }
}