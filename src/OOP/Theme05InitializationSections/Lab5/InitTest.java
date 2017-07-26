package OOP.Theme05InitializationSections.Lab5;

/**
 * Write class InitTest with private field id of int type and static private field nextId of integer. <p>
 * Write code that: <p>
 *  - Initialize static field nextId of some random value (in 1 … 1000 range) once when class loaded to JVM; <p>
 *  - Increments static field nextId each time when new instance of InitTest created; <p>
 *  - Initialize field id of nextId field value each time when new instance of InitTest created. <p>
 * And method getId() which will return value of id. <p>
 */
public class InitTest {
    private int id;
    static private int nextId = (int)(Math.random() * 1000 + 1);

    {
        id = nextId;
        id++;
    }

    void getId(){
        System.out.println(nextId);
        System.out.println(id);
    }

}
