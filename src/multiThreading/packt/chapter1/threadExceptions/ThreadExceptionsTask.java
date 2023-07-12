package multiThreading.packt.chapter1.threadExceptions;

/**
 * Processing uncontrolled exceptions in a thread
 * */
public class ThreadExceptionsTask implements Runnable {
    @Override
    public void run() {
        final int i = Integer.parseInt("HelloWorld");
    }
}
