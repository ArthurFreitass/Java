package construtoresThisSobrecargaEncapsulamento.construtores.exercicioAntigoEncapsulamento.application;

import construtoresThisSobrecargaEncapsulamento.construtores.exercicioAntigoEncapsulamento.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        // Dados pertencem a própria classe
        Product p = new Product(name, price, quantity);

        System.out.println("\nProduct Data: "+p);

        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt();

        p.addProducts(quantity);

        System.out.println("\nUpdate data: "+p);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        p.removeProducts(quantity);
        System.out.println("\nUpdate data: "+p);

        sc.close();
    }
}
