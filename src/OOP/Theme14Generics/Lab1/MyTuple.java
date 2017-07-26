package OOP.Theme14Generics.Lab1;

/**
 * Created by DELL on 07.03.2017.
 */
public class MyTuple<A, B, C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    @Override
    public String toString() {
        return  a.getClass().getSimpleName() + " " +
                "a = " + a + " " +
                b.getClass().getSimpleName() + " " +
                "b = " + b + " " +
                c.getClass().getSimpleName() + " " +
                "c = " + c;
    }
}
