package MultiThreading.Thread;

public class OverrideStartThread extends Thread {
    @Override
    public synchronized void start() {
        super.start();
        System.out.println("Start Method");
    }

    @Override
    public void run() {
        System.out.println("Run Method");
    }
}
