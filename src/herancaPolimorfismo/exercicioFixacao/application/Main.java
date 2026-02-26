package exercicioFixacao.application;

import exercicioFixacao.entities.ImportedProduct;
import exercicioFixacao.entities.Product;
import exercicioFixacao.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Product # " + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if (productType == 'c') {
                productList.add(new Product(name, price));
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String strDate = sc.nextLine();
                LocalDate date = LocalDate.parse(strDate, fmt);
                productList.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println("\nPRICE TAGS:");
        for (Product p : productList) {
            System.out.println(p.priceTag());
        }
    }
    final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
