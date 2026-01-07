package construtoresThisSobrecargaEncapsulamento.construtores.testeExercicio.application;

import construtoresThisSobrecargaEncapsulamento.construtores.testeExercicio.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p;

        System.out.println("Product data:");

        System.out.print("Enter the product ID: ");
        int ID = sc.nextInt();

        System.out.print("Enter the product name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter the product price: ");
        double price = sc.nextDouble();

        System.out.println("\nWill there be an initial inventory? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y') {

            System.out.println("\nEnter the quantity of products in stock: ");
            int initialQuantity = sc.nextInt();
            p = new Product(ID, name, price, initialQuantity);

        } else {
            p = new Product(ID, name, price);
        }

        System.out.println("\nProduct data: "+ p);

        System.out.print("\nAdd some quantity of products to the inventory: ");
        int quantity = sc.nextInt();

        p.addProducts(quantity);

        System.out.println("\nUpdate product data: "+ p);

        System.out.print("\nRemove some quantity of products to the inventory: ");
        quantity = sc.nextInt();

        p.removeProducts(quantity);

        System.out.println("\nUpdate product data: "+ p);

        sc.close();
    }
}
