package OOP.Theme07InheritanceAndPolymorphism.Lab1_2_3_4_5;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;


    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                "resolutionX = " + resolutionX + '\n' +
                "resolutionY = " + resolutionY + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}