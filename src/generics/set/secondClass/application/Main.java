package generics.set.secondClass.application;

import generics.set.secondClass.entities.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>(Arrays.asList((new Product("TV", 2000.0, 3)), (new Product("Notebook", 3000.0, 1)), (new Product("Tablet", 800.0, 2))));

        Product product = new Product("TV", 2000.0, 3);

        System.out.println();
        for (Object i : products) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println(products.contains(product));
    }
}
