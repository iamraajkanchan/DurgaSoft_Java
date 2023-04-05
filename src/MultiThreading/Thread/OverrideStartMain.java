package MultiThreading.Thread;

public class OverrideStartMain {
    public static void main(String[] args) {
        OverrideStartThread thread = new OverrideStartThread();
        thread.start();
        System.out.println("Main Method");
        thread.start();
    }
}