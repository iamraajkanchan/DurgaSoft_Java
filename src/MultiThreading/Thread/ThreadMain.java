package MultiThreading.Thread;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        /* This is Thread Instantiation */
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(thread.getName());
        Thread.currentThread().setName("ThreadMain Thread");
        /* This for loop is executed by Main Thread */
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
