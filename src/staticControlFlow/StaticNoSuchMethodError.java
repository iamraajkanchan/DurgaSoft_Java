package staticControlFlow;

public class StaticNoSuchMethodError {
    static {
        /* Throws NoSuchMethodError */
        m1();
    }

    public static void m1() {
        System.out.println(x);
    }

    static int x = 10;
}
