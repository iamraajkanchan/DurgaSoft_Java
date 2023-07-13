package multiThreading.packt.threadManagement.threadGroupException;

/**
 * Processing uncontrolled exceptions in a group of threads
 * */
public class ThreadGroupExceptionSimulator {
    public static void main(String... args) {
        final ThreadGroupExceptionThreadGroup threadGroup = new ThreadGroupExceptionThreadGroup("ThreadGroupExceptionThreadGroup");
        final ThreadGroupExceptionTask task = new ThreadGroupExceptionTask();
        for (int i = 0; i < 3; i++) {
            final Thread thread = new Thread(threadGroup, task);
            thread.start();
        }
    }
}
