package exceptionHandling;

public class StackTraceExample {
    /**
     * @throws ClassNotFoundException is a Checked Exception
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            doStuff();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalAccessException is a Checked Exception
     */
    public static void doStuff() throws IllegalAccessException {
        try {
            doMoreStuff();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws NoSuchMethodException is a Checked Exception
     */
    public static void doMoreStuff() throws NoSuchMethodException {
        System.out.println("Hello World!!!");
    }
}
