package multiThreading.packt.chapter1.threadAttributesWithLogs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Getting and setting thread information
 * */

public class ThreadAttributeWithLogsSimulator {
    public static void main(String... args) {
        Thread[] threads = new Thread[10];
        Thread.State[] status = new Thread.State[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new ThreadAttributeWithLogsCalculator(i));
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
        }
        try {
            final File dir = new File("data");
            if (!dir.exists()) {
                if (!dir.mkdir()) {
                    System.out.println("Folder Not Found!!!");
                    System.exit(0);
                } else {
                    processIfDirectoryExist(dir, threads, status);
                }
            } else {
                processIfDirectoryExist(dir, threads, status);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processIfDirectoryExist(File dir, Thread[] threads, Thread.State[] status) throws IOException {
        FileWriter file = new FileWriter(new File(dir, "logs.txt"));
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < 10; i++) {
            pw.printf("Main: Status of Thread %d %s\n", i, threads[i].getState());
            status[i] = threads[i].getState();
        }
        pw.printf("Main : *****************************************************************\n");
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        boolean finish = false;
        while (!finish) {
            for (int i = 0; i < 10; i++) {
                if (threads[i].getState() != status[i]) {
                    writeThreadInfo(pw, threads[i], status[i]);
                    status[i] = threads[i].getState();
                }
                finish = true;
            }
            for (int i = 0; i < 10; i++) {
                finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
            }
        }
        new Thread(pw::close).start();
    }

    private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
        pw.printf("Main : ID %d - %s\n", thread.threadId(), thread.getName());
        pw.printf("Main : Priority - %d\n", thread.getPriority());
        pw.printf("Main : Old State - %s\n", state);
        pw.printf("Main : New State - %s\n", thread.getState());
        pw.printf("Main : *****************************************************************\n");

    }
}
