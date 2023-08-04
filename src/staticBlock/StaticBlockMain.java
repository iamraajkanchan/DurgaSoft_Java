package staticBlock;

public class StaticBlockMain {
    static {
        System.out.println("StaticBlockMain :: static :: I can print without main method");
        /* Stops the JVM */
        // System.exit(0);
    }
    public static void main(String... args) {
        System.out.println("StaticBlockMain :: main");
        System.out.println("StaticBlockMain :: main :: hashCode : " + String.valueOf(StaticBlockMain.class.hashCode()).substring(0, 4));
    }
}
