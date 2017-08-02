package OOP.Theme17Multithreading.Lab3;

public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;
    int[] arrInt;
    long resultSum;

    @Override
    public void run() {
        if(arrInt == null || startIndex < 0 || stopIndex > arrInt.length)return;
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += arrInt[i];
        }
    }

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

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }

    public long getResultSum() {
        return resultSum;
    }
}
