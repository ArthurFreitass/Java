package lambda.function.service;

import lambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public ProductService() {
    }

    public List<String> transformerProductsInStr(List<Product> products) {
        List<String> nameProducts = new ArrayList<>();
        // Use for - imperative
        for (Product i : products) {
            nameProducts.add(i.getName().toUpperCase());
        }
        return nameProducts;
    }
}
