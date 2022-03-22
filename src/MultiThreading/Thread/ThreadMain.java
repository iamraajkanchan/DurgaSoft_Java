package MultiThreading.Thread;

public class ThreadMain {
    public static void main(String[] args) {
        /* This is Thread Instantiation */
        MyThread thread = new MyThread();
        thread.start();
        /* This for loop is executed by Main Thread */
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}