package OOP.Theme05InitializationSections.Lab5;

/**
 * Create class Main, which will create five instances of class InitTest and invokes method getId()
 * on each instance and print returned value on console.
 */
public class Main {
    public static void main(String[] args) {
        InitTest test1 = new InitTest();
        test1.getId();

        InitTest test2 = new InitTest();
        test2.getId();

        InitTest test3 = new InitTest();
        test3.getId();

        InitTest test4 = new InitTest();
        test4.getId();

        InitTest test5 = new InitTest();
        test5.getId();
    }
}
