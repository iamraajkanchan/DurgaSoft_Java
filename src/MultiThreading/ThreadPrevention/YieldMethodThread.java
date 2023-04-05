package MultiThreading.ThreadPrevention;

public class YieldMethodThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
