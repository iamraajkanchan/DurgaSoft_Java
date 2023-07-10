package multiThreading.threadPrevention;

public class JoinMethodMain {
    public static void main(String[] args) {
        JoinMethodThread thread1 = new JoinMethodThread();
        thread1.start();
        try {
            thread1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
