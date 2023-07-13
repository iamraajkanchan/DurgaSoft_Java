package multiThreading.packt.threadManagement.threadGroupException;

public class ThreadGroupExceptionThreadGroup extends ThreadGroup {
    /* You must override this constructor */
    public ThreadGroupExceptionThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The Thread %d has thrown an Exception", t.threadId());
        e.printStackTrace(System.out);
        System.out.println("Terminating the rest of the thread");
        interrupt();
    }
}
