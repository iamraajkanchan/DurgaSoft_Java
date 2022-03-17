package StaticControlFlow;

public class StaticControlFlowMain {
    static int i = 10;

    static {
        m1();
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        /* You can't declare a static variable inside a static method. */
        // static int x = 20;
        /* We cannot call a non-static method or variable inside a static method. */
        m1();
        System.out.println("Main Method");
    }

    public static void m1() {
        /* We cannot call a non-static method or variable inside a static method. */
        System.out.println("j: " + j);
    }

    static {
        System.out.println("Second Static Block");
    }

    static int j = 20;
}
