package OOP.Theme05InitializationSections.Lab1;

/**
 * Create class MyInitTest with two initialization blocks, two static initialization blocks
 * and two constructors (one constructor() must invoke second constructor(int)).
 * On each block write code that prints on console type of block and block number. <p>
 * For example: <p>
 * “static initialization block 1” <p>
 * “static initialization block 2” <p>
 * “non-static initialization block 1” <p>
 * “non-static initialization block 2” <p>
 * “constructor 1” <p>
 * “constructor 2” <p>
 */
public class MyInitTest {
    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    public MyInitTest(){
        this(5);
        System.out.println("constructor 1");
    }
    public MyInitTest(int a){
        System.out.println("constructor 2");
    }
}
