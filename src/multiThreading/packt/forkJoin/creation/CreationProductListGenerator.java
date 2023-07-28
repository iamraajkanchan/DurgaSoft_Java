package multiThreading.packt.forkJoin.creation;

import java.util.ArrayList;
import java.util.List;

public class CreationProductListGenerator {
    public List<CreationProduct> generate(int size) {
        final List<CreationProduct> products = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            final CreationProduct product = new CreationProduct();
            product.setName("Product " + i);
            product.setPrice(10);
            products.add(product);
        }
        return products;
    }
}
