package SE.Theme09TheProxyClasses.Lab1;

import java.lang.reflect.Proxy;

/**
 * 1) Create a Calculate interface with methods: multiplication() and division() that perform a multiplication and a division of two numbers. <p>
 *
 * 2) Create a CalculateImpl class, which implements the interface Calculate.<p>
 *
 * 3) Create a CalculateProxy class, which is used as a invocation handler, and includes: <p>
 *      - a objCalc field of type Object and a private constructor to initialize (contains target object); <p>
 *      - overridden invoke() method, which outputs information about that method is called (name),
 *        with what arguments, and what was the result, and dispatches the execution target object; <p>
 *      - static method Object newInstance (Object obj), which receives the target object and creates a proxy class instance;<p>
 *
 * 4) Create a Main class with a main() method, which demonstrates the calculation of a proxy class. <p>
 */
public class Main {
    public static void main(String[] args) {

        Calculate plainCalculate = new CalculateImpl();
        System.out.println("Calls methot without proxy");
        plainCalculate.division(5, 2);
        plainCalculate.multiplication( 5,2);

        Calculate proxiedCalculate = (Calculate) Proxy.newProxyInstance(plainCalculate.getClass().getClassLoader(),
                plainCalculate.getClass().getInterfaces(),
                new CalculateProxy(plainCalculate));

        System.out.println("Call methods using the proxy");
        proxiedCalculate.division(5,2);
        proxiedCalculate.multiplication(5,2);
    }
}
