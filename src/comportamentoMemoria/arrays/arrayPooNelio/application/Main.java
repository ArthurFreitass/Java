package comportamentoMemoria.arrays.arrayPooNelio.application;

import comportamentoMemoria.arrays.arrayPooNelio.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Estou criando um vetor
        Product[] p = new Product[n];
        double sum = 0;

        for (int index = 0; index < n; index += 1) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            p[index] = new Product(name, price);
            sum += p[index].getPrice();
        }

        double average = sum / n;

        System.out.printf("AVERAGE PRICE = $ %.2f%n", average);
    }
}
