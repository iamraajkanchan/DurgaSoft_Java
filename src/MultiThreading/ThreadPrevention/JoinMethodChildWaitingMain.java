package MultiThreading.ThreadPrevention;

public class JoinMethodChildWaitingMain {
    public static void main(String[] args) throws InterruptedException {
        JoinMethodChildWaitingThread.mt = Thread.currentThread();
        JoinMethodChildWaitingThread thread = new JoinMethodChildWaitingThread();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
