package MultiThreading.ThreadPrevention;

public class JoinMethodChildWaitingThread extends Thread {
    static Thread mt;

    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
