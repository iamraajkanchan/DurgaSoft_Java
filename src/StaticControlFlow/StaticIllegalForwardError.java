package StaticControlFlow;

public class StaticIllegalForwardError {
    static {
        /* Throws Illegal Forward Reference: Compile Time Error*/
        // System.out.println(x);
    }
    static int x = 10;
}
