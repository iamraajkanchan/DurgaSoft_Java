package multiThreading.packt.forkJoin.creation;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class CreationSimulator {
    public static void main(String... args) {
        final CreationProductListGenerator generator = new CreationProductListGenerator();
        final List<CreationProduct> products = generator.generate(1000000);
        final CreationTask task = new CreationTask(products, 0, products.size(), 0.75);
        try {
            final ForkJoinPool pool = new ForkJoinPool();
            pool.execute(task);
            do {
                System.out.printf("CreationSimulator: Thread Count: %d\n", pool.getActiveThreadCount());
                System.out.printf("CreationSimulator: Thread Steal: %d\n", pool.getStealCount());
                System.out.printf("CreationSimulator: Parallelism: %d\n", pool.getParallelism());
                System.out.printf("CreationSimulator: Thread Count: %d\n", pool.getQueuedTaskCount());
                try {
                    TimeUnit.MILLISECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.out);
                }
            } while (!task.isDone());
            pool.shutdown();
        } catch (SecurityException e) {
            e.printStackTrace(System.out);
        }
        if (task.isCompletedNormally()) {
            System.out.println("CreationSimulator: Task is completed normally");
        }
        for (CreationProduct product : products) {
            System.out.printf("CreationSimulator: Product - Name: %s - Price: %f\n", product.getName(), product.getPrice());
        }
        System.out.println("CreationSimulator: End of the program");
    }
}
