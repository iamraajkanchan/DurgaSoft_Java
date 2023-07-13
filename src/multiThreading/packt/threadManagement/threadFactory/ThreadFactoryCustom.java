package multiThreading.packt.threadManagement.threadFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * Creating threads through a factory
 * */
public class ThreadFactoryCustom implements ThreadFactory {
    private int counter;
    private final String name;
    private final List<String> stats;
    public ThreadFactoryCustom(String name) {
        counter = 0;
        this.name = name;
        stats = new ArrayList<>();
    }
    @Override
    public Thread newThread(Runnable r) {
        final Thread thread = new Thread(r, name + "-Thread_" + counter);
        counter++;
        stats.add(String.format("Created thread %d with name %s on %s", thread.threadId(), thread.getName(), new Date()));
        return thread;
    }
    public String getStats() {
        final StringBuilder buffer = new StringBuilder();
        for (String stat : stats) {
            buffer.append(stat);
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
