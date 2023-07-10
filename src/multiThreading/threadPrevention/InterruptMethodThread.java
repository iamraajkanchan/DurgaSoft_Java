package multiThreading.threadPrevention;

public class InterruptMethodThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(currentThread().getName() + " is interrupted");
        }
    }
}
