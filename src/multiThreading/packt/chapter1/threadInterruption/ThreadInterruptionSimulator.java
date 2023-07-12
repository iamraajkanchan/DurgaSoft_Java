package multiThreading.packt.chapter1.threadInterruption;

/**
 * Interrupting a thread
 * */
public class ThreadInterruptionSimulator {
    public static void main(String... args) {
        final ThreadInterruptionPrimeGenerator task = new ThreadInterruptionPrimeGenerator();
        task.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.setUncaughtExceptionHandler((t, e) -> System.out.printf("%s thrown by %d", e.getMessage(), t.threadId()));
        task.interrupt();
    }
}
