package lambda.consumer.application;

import lambda.fixacao.application.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

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

            // Increase 10% in price products with consumer

            printerProducts(products);

            System.out.println();

            Consumer<Product> consumer = new Consumer<Product>() {
                @Override
                public void accept(Product product) {
                    double price = product.getPrice();
                    product.setPrice(price + (price * 10 / 100.0));
                }
            };

            // products.forEach(consumer);
            products.forEach(p -> p.setPrice(p.getPrice() * 1.1));

            products.forEach(System.out::println);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printerProducts(List<Product> products) {
        for (Product i : products) {
            System.out.println(i);
        }
    }
}
