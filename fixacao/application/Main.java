package generics.fixacao.application;

import generics.fixacao.entities.Product;
import generics.fixacao.service.CalculationService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number of products: ");

            int n = sc.nextInt(); sc.nextLine();

            if (n > 0) {

                List<Product> list = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    System.out.println("\nProduct # "+ (i + 1) + ":");

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble(); sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt(); sc.nextLine();

                    list.add(new Product(name, price, quantity));
                }

                list = CalculationService.sort(list);

                System.out.println("\n---SORT PRODUCTS---");
                for (Product item : list) {
                    System.out.println(item);
                }
            }
        }
    }
}
