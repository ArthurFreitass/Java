package lambda.fixacao.application;

import lambda.fixacao.application.entities.Product;
import lambda.fixacao.application.entities.ProductNameComparator;
import lambda.fixacao.application.entities.ProductPriceComparator;
import lambda.fixacao.application.entities.ProductQuantityComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Keyboard", 250.00, 12));
        products.add(new Product("Mouse", 120.00, 30));
        products.add(new Product("Monitor", 1500.00, 5));
        products.add(new Product("Headset", 350.00, 18));
        products.add(new Product("Mousepad", 80.00, 40));

        Main m = new Main();
        m.first(products);
        System.out.println();
        m.finalV(products);
    }

    private void finalV(List<Product> list) {
        System.out.println("FINAL\n");
        System.out.println("BY PRICE");
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        // Other form ((Comparator.comparing(Product::getPrice())))
        printer(list);

        System.out.println();

        System.out.println("BY NAME");
        list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        printer(list);

        System.out.println();

        System.out.println("BY QUANTITY");
        list.sort((p1, p2) -> p1.getQuantity().compareTo(p2.getQuantity()));
        printer(list);
    }

    private void first(List<Product> list) {
        System.out.println("FIRST\n");
        orderByPrice(list);
        System.out.println();

        orderByName(list);
        System.out.println();

        orderByQuantity(list);
    }

    private void orderByPrice(List<Product> products) {
        System.out.println("=== BY PRICE ===");
        ProductPriceComparator priceComparator = new ProductPriceComparator();
        products.sort(priceComparator);
        printer(products);
    }

    private void orderByName(List<Product> products) {
        System.out.println("=== BY NAME ===");
        ProductNameComparator nameComparator = new ProductNameComparator();
        products.sort(nameComparator);
        printer(products);
    }

    private void orderByQuantity(List<Product> products) {
        System.out.println("=== BY QUANTITY ===");
        ProductQuantityComparator nameComparator = new ProductQuantityComparator();
        products.sort(nameComparator);
        printer(products);
    }


    private void printer(List<Product> list) {
        for (Product o : list) {
            System.out.println(o);
        }
    }
}
