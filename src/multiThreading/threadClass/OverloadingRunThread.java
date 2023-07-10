package multiThreading.threadClass;

public class OverloadingRunThread extends Thread {
    @Override
    public void run() {
        System.out.println("No Argument Run Method");
    }

    public void run(int i) {
        System.out.println("Int Argument Run Method");
    }
}
