package multiThreading.threadClass;

public class MyThread extends Thread {
    @Override
    public void run() {
        /* This for loop is executed by Child Thread  */
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}