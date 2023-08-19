package multiThreading.packt.syncUtility.phasedTasks;

import java.util.concurrent.Phaser;

public class PTSimulator {
    public static void main(String... args) {
        final Phaser phaser = new Phaser(3);
        final PTFileSearch firstSearch = new PTFileSearch("/Users", "640208", phaser);
        final PTFileSearch secondSearch = new PTFileSearch("/Users", "Hello World", phaser);
        final PTFileSearch thirdSearch = new PTFileSearch("/Users", "Poppins", phaser);
        final Thread firstSearchThread = new Thread(firstSearch, "First Search Thread");
        final Thread secondSearchThread = new Thread(secondSearch, "Second Search Thread");
        final Thread thirdSearchThread = new Thread(thirdSearch, "Third Search Thread");
        firstSearchThread.start();
        secondSearchThread.start();
        thirdSearchThread.start();
        try {
            firstSearchThread.join();
            secondSearchThread.join();
            thirdSearchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        System.out.println("Terminated : " + phaser.isTerminated());
    }
}
