package orientacaoObjetos.exemploDois;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter the product details [name, price, and quantity in stock]:");
        p.nameProduct = sc.nextLine();
        p.priceProduct = sc.nextDouble();
        p.stockQuantity = sc.nextInt();

        p.displayProductData();

        System.out.println("\nEnter a number of products to be added to the inventory.");
        int quantity = sc.nextInt();

        p.addProduct(quantity);

        System.out.println(p);

        System.out.println("\nEnter a number of products to be removed from inventory.");
        quantity = sc.nextInt();

        sc.close();

        p.removeProduct(quantity);

        System.out.println(p);
    }
}