package MultiThreading.RunnableInterface;

public class RunnableInterfaceMain {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread");
        }
        thread1.start();
    }
}
