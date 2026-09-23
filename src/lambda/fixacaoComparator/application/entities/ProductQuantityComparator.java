package lambda.fixacaoComparator.application.entities;

import java.util.Comparator;

public class ProductQuantityComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getQuantity().compareTo(o2.getQuantity());
    }
}
