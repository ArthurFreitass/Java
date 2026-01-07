package comportamentoMemoria.arrays.exercicios.exercicioDois.application;

import comportamentoMemoria.arrays.exercicios.exercicioDois.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        Product[] p = new Product[quantity]; // Cria x referências na heap
        double sum = 0;


        for (int index = 0; index < p.length; index += 1) {

            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            p[index] = new Product(name, price); // Cria o objeto Product
            sum += p[index].getPrice();
        }

        double avg = sum / quantity;

        System.out.printf("AVERAGE PRICES = $ %.2f%n", avg);

    }
}
