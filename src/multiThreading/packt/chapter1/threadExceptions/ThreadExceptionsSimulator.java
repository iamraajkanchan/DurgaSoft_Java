package multiThreading.packt.chapter1.threadExceptions;

/**
 * Processing uncontrolled exceptions in a thread
 * */
public class ThreadExceptionsSimulator {
    public static void main(String... args) {
        final ThreadExceptionsTask task = new ThreadExceptionsTask();
        final Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ThreadExceptionHandler());
        thread.start();
    }
}
