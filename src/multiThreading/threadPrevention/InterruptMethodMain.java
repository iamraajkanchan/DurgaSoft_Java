package multiThreading.threadPrevention;

public class InterruptMethodMain {
    public static void main(String[] args) throws InterruptedException {
        InterruptMethodThread thread = new InterruptMethodThread();
        thread.start();
        thread.interrupt();
        System.out.println("End of Main");

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is printing " + i);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        thread1.interrupt();
    }
}