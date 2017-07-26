package OOP.Theme01ClassAndInstances;

/**
 * Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array (using loop).
 *
 * Write a program that iterate through array of Computer objects and increases by 10 percent field price.
 */
public class TestComputer {
    public static void main(String[] args) {

        float increases = 1.1f;

        String[] manufacturerArr = {"My PC", "Brothers PC", "Sisters PC", "Mothers PC", "Father PC"};
        int[] serialNumberArr = {7777777, 1234567, 1111111, 7654321, 555555};
        float[] priceArr = {1000f, 651.56f, 957.25f, 987.32f, 597.77f};
        int[] quantityCPUArr = {8, 4, 4, 2, 2};
        int[] freqencyCPUArr = {4500, 2200, 3200, 2300, 2500};

        Computer[] computer = new Computer[5];

        for (int i = 0; i < computer.length; i++) {
            computer[i] = new Computer();

            computer[i].setManufacturer(manufacturerArr[i]);
            computer[i].setSerialNumber(serialNumberArr[i]);
            computer[i].setPrice(priceArr[i] * increases);
            computer[i].setQuantityCPU(quantityCPUArr[i]);
            computer[i].setFreqencyCPU(freqencyCPUArr[i]);

            computer[i].view();
        }
    }
}
