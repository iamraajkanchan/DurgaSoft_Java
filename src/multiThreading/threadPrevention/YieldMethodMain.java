package multiThreading.threadPrevention;

public class YieldMethodMain {
    public static void main(String[] args) {
        YieldMethodThread thread = new YieldMethodThread();
        thread.start();
        for (int i = 0; i < 5; i++)
            System.out.println("Main Thread");
    }
}
