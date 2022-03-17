package StaticBlock;

public class PrintWithInstanceVariable {
    static PrintWithoutStaticBlockAndMain printWithoutStaticBlockAndMain = new PrintWithoutStaticBlockAndMain();

    /* This is an Instance Variable. */

    {
        System.out.println("I can print");
        System.exit(0);
    }
}
