package multiThreading.packt.chapter1.basicsWithLogs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicsWithLogsThreadSimulator {
    public static void main(String... args) {
        Thread[] threads = new Thread[10];
        Thread.State[] status = new Thread.State[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new BasicsWithLogsCalculator(i));
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
            threads[i].start();
        }
        try {
            FileWriter file = new FileWriter(".\\data\\logs.txt");
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; i < 10; i++) {
                pw.println("Main: Status of Thread " + i + threads[i].getState());
                status[i] = threads[i].getState();
                threads[i].start();
                boolean finish = false;
                while (!finish) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
