package multiThreading.packt.chapter1.threadJoin;

import java.util.Date;

/**
 * Waiting for the finalization of a thread
 * */
public class ThreadJoinSimulator {
    public static void main(String... args) {
        ThreadJoinDataSourceLoader dataSourceLoader = new ThreadJoinDataSourceLoader();
        Thread loaderTask = new Thread(dataSourceLoader);
        ThreadJoinNetworkConnectionsLoader networkConnectionsLoader = new ThreadJoinNetworkConnectionsLoader();
        Thread networkLoaderTask = new Thread(networkConnectionsLoader);
        loaderTask.start();
        networkLoaderTask.start();
        try {
            loaderTask.join();
            networkLoaderTask.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // The below line doesn't execute until both the threads are finished
        // Note: The state of both the Threads are Runnable.
        System.out.printf("Main: Configuration has been loaded - %s", new Date());
    }
}
