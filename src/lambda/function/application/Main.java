package lambda.function.application;

import lambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            List<Product> products = new ArrayList<>();

            products.add(new Product("Keyboard", 25.00, 12));
            products.add(new Product("Mouse", 120.00, 30));
            products.add(new Product("Monitor", 1500.00, 5));
            products.add(new Product("Headset", 350.00, 18));
            products.add(new Product("Mousepad", 80.00, 40));

            Function<Product, String> strProductFunction = new Function<Product, String>() {
                @Override
                public String apply(Product product) {
                    return product.getName().toUpperCase();
                }
            };

            List<String> productNames = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
            System.out.println(productNames);

        } catch (RuntimeException e) {
            e.getMessage();
        }
    }
}