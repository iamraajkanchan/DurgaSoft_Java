package MultiThreading.DurgaApproach;

public class DurgaApproachMain {
    public static void main(String[] args) {
        DurgaApproachThread durgaApproachThread = new DurgaApproachThread();
        Thread thread = new Thread(durgaApproachThread);
        thread.start();
        System.out.println("Main Thread");
    }
}