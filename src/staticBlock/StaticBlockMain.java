package staticBlock;

public class StaticBlockMain {
    static {
        System.out.println("I can print without main method.");
        /* Use this method to stop JVM. */
        System.exit(0);
    }
}
