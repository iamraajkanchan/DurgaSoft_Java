package staticBlock;

public class PrintWithoutStaticBlockAndMain {
    static int i = m1();

    static int m1() {
        System.out.println("I can print");
        /* Use this method to stop JVM */
        System.exit(0);
        return 10;
    }
}
