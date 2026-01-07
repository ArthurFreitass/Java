package comportamentoMemoria.arrays.arrayPoo.application;

import comportamentoMemoria.arrays.arrayPoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String [] name = new String[n];
        double [] price = new double[n];

        for (int index = 0; index < n; index += 1) {
            name[index] = sc.next();
            price[index] = sc.nextDouble();
        }

        Product p = new Product(name, price);

        System.out.print("\n"+ p);
    }
}
