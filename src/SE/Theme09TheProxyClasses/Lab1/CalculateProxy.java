package SE.Theme09TheProxyClasses.Lab1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CalculateProxy implements InvocationHandler {

    private static Object objCalc;

    public CalculateProxy(Object objCalc) {
        this.objCalc = objCalc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("The method <" + method.getName() + "> invoked with args: " + Arrays.toString(args));
        Object result = method.invoke(objCalc, args);
        System.out.println("The method <" + method.getName() + "> ends with result: " + result.toString());
        return result;
    }
}
