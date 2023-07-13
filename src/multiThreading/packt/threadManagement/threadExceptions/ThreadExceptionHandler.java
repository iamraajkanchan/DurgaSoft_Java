package multiThreading.packt.threadManagement.threadExceptions;

/**
 * Processing uncontrolled exceptions in a thread
 * */
public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("An exception has been captured");
        System.out.printf("Thread: %d\n", t.threadId());
        System.out.printf("Exception: %s %s\n", e.getClass().getName(), e.getMessage());
        System.out.println("Stack Trace:");
        e.printStackTrace(System.out);
        System.out.printf("Thread Status: %s\n", t.getState());
    }
}
