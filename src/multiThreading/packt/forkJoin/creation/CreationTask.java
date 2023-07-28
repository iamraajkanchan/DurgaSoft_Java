package multiThreading.packt.forkJoin.creation;

import java.io.Serial;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class CreationTask extends RecursiveAction {
    @Serial
    private static final long serialVersionUID = 1L;
    private final List<CreationProduct> products;
    private final int first;
    private final int last;
    private final double increment;

    public CreationTask(List<CreationProduct> products, int first, int last, double increment) {
        this.products = products;
        this.first = first;
        this.last = last;
        this.increment = increment;
    }

    @Override
    protected void compute() {
        if (last - first < 10) {
            updateProductPrice();
        } else {
            final int middle = (first + last) / 2;
            System.out.printf("CreationTask: Pending tasks %d\n", getQueuedTaskCount());
            final CreationTask firstTask = new CreationTask(products, first, middle, increment);
            final CreationTask secondTask = new CreationTask(products, middle, last, increment);
            invokeAll(firstTask, secondTask);
        }

    }

    private void updateProductPrice() {
        for (int i = first; i < last; i++) {
            final CreationProduct product = products.get(i);
            product.setPrice(product.getPrice() + (1 + increment));
        }
    }
}
