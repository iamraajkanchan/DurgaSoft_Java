package StaticControlFlow;

public class StaticExceptionTest {
    static int x = 10;

    /* Throws NoSuchMethodError */
    static {
        System.out.println(x);
    }
}
