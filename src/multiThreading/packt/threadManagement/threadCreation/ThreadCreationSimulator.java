package multiThreading.packt.threadManagement.threadCreation;

/**
 * Creating and running a thread
 * */
public class ThreadCreationSimulator {
    public static void main(String... args) {
        final ThreadCreationCalculator calculator = new ThreadCreationCalculator(9);
        final Thread thread = new Thread(calculator);
        thread.start();
    }
}
