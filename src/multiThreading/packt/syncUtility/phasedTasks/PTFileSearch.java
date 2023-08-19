package multiThreading.packt.syncUtility.phasedTasks;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Running concurrent phased tasks  - Page No 105
 */

public class PTFileSearch implements Runnable {
    private final String initPath;
    private final String end;
    private List<String> foundPaths;
    private final Phaser phaser;

    public PTFileSearch(String initPath, String end, Phaser phaser) {
        this.initPath = initPath;
        this.end = end;
        this.phaser = phaser;
        foundPaths = new ArrayList<>();
    }

    @Override
    public void run() {
        phaser.arriveAndAwaitAdvance();
        System.out.printf("%s: Starting.\n", Thread.currentThread().getName());
        final File file = new File(initPath);
        if (file.isDirectory()) {
            directoryProcess(file);
        }
        if (!checkResults()) {
            return;
        }
        filterResults();
        if (!checkResults()) {
            return;
        }
        showInfo();
        phaser.arriveAndDeregister();
        System.out.printf("%s: Work Completed.\n", Thread.currentThread().getName());
    }

    public void directoryProcess(File file) {
        final File[] fileList = file.listFiles();
        if (fileList != null && fileList.length > 0) {
            for (File fileItem : fileList) {
                if (fileItem.isDirectory()) {
                    directoryProcess(fileItem);
                } else {
                    fileProcess(fileItem);
                }
            }
        }
    }

    public void fileProcess(File file) {
        if (file.getName().endsWith(end)) {
            foundPaths.add(file.getAbsolutePath());
        }
    }

    public void filterResults() {
        final List<String> filteredPaths = new ArrayList<>();
        final long actualDateTime = Calendar.getInstance().getTimeInMillis();
        for (String path : foundPaths) {
            final File file = new File(path);
            final long lastModifiedTime = file.lastModified();
            if (actualDateTime - lastModifiedTime < TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)) {
                filteredPaths.add(path);
            }
        }
        foundPaths = filteredPaths;
    }

    private boolean checkResults() {
        if (foundPaths.isEmpty()) {
            System.out.printf("%s: Phase %d: 0 path found.\n", Thread.currentThread().getName(), phaser.getPhase());
            System.out.printf("%s: Phase %d: End.\n", Thread.currentThread().getName(), phaser.getPhase());
            phaser.arriveAndDeregister();
            return false;
        } else {
            System.out.printf("%s: Phase %d: %d paths found.\n", Thread.currentThread().getName(), phaser.getPhase(), foundPaths.size());
            phaser.arriveAndAwaitAdvance();
            return true;
        }
    }

    private void showInfo() {
        for (String path : foundPaths) {
            File file = new File(path);
            System.out.printf("%s : %s\n", Thread.currentThread().getName(), file.getAbsolutePath());
            phaser.arriveAndAwaitAdvance();
        }
    }
}
