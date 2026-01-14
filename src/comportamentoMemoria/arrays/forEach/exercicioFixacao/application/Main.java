package comportamentoMemoria.arrays.forEach.exercicioFixacao.application;

import comportamentoMemoria.arrays.forEach.exercicioFixacao.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product[] p = new Product[2];

        for (int i = 0; i < p.length; i++) {
            System.out.print("Entre com o nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Entre com o seu preço: ");
            double price = sc.nextDouble();
            sc.nextLine();

            p[i] = new Product(name, price);
        }

        for (Product obj : p) {
            System.out.println("\n" + obj);
        }
    }
}
