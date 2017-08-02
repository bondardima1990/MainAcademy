package OOP.Theme11ExceptionsAndAssertions.Lab1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Program start");
            throw new Exception("Exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program end");
        }
    }
}
