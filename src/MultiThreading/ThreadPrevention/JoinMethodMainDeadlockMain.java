package MultiThreading.ThreadPrevention;

public class JoinMethodMainDeadlockMain {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
