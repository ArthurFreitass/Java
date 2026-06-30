package generics.secondExample.application;

import generics.secondExample.entities.Product;
import generics.secondExample.service.CalculationService;
// import generics.secondExample.service.CalculationServiceNoComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a path file: ");
            String path = sc.nextLine();
            System.out.println();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                List<Product> list = new ArrayList<>();

                String line = br.readLine();
                while (line != null) {
                    String nameProduct = line.split(",")[0];
                    double price = Double.parseDouble(line.split(",")[1]);

                    list.add(new Product(nameProduct, price));
                    line = br.readLine();
                }

                for (Product p : list) {
                    System.out.println(p);
                }

                System.out.println("\nMost expensive:");

                CalculationService calculationService = new CalculationService();

                System.out.println(calculationService.max(list));

                // CalculationServiceNoComparable calculationServiceNoComparable = new CalculationServiceNoComparable();
                // System.out.println(calculationServiceNoComparable.max(list));

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
