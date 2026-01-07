package orientacaoObjetos.membrosEstaticos.exercicioFixacaoDois.application;

import orientacaoObjetos.membrosEstaticos.exercicioFixacaoDois.entities.DiscountCalculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a price: ");
        double price = sc.nextDouble();

        double priceWithDiscount = DiscountCalculator.finalPrice(price);

        System.out.printf("Final price R$ = %.2f", priceWithDiscount);

    }
}
