package multiThreading.packt.threadManagement.threadInterruptionControl;

import java.io.File;

/**
 * Controlling the interruption of a thread
 * */
public class ThreadInterruptionControlFileSearch implements Runnable {
    private final String initPath;
    private final String fileName;

    public ThreadInterruptionControlFileSearch(String initPath, String fileName) {
        this.initPath = initPath;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        final File file = new File(initPath);
        if (file.isDirectory()) {
            try {
                directoryProcess(file);
            } catch (InterruptedException e) {
                System.out.printf("%s: The search has been interrupted\n", Thread.currentThread().getName());
            }
        }
    }

    private void directoryProcess(File file) throws InterruptedException {
        final File[] list = file.listFiles();
        if (list != null) {
            for (File item : list) {
                if (item.isDirectory()) {
                    directoryProcess(item);
                } else {
                    fileProcess(item);
                }
            }
        }
    }

    private void fileProcess(File file) throws InterruptedException {
        if (file.getName().equals(fileName)) {
            System.out.printf("%s is found in %s thread\n", file.getAbsolutePath(), Thread.currentThread().getName());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException("");
        }
    }

}
