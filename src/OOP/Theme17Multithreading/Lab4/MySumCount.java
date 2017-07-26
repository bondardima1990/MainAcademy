package OOP.Theme17Multithreading.Lab4;

/**
 * Created by DELL on 05.04.2017.
 */
public class MySumCount implements Runnable {
    private int startIndex;
    private int stopIndex;
    private int[] arrayInt;
    private long resultSum;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(int[] arrayInt) {
        this.arrayInt = arrayInt;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setResultSum(long resultSum) {
        this.resultSum = resultSum;
    }

    @Override
    public void run() {
        if (startIndex < 0 || arrayInt == null || stopIndex > arrayInt.length) return;
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += arrayInt[i];
        }
    }
}
