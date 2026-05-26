package interfaces.defaultMethods.application;

import interfaces.defaultMethods.entities.BrasilInterestService;
import interfaces.defaultMethods.entities.InterestService;
import interfaces.defaultMethods.entities.UsaInterestService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a amount: ");
            double amount = sc.nextDouble(); sc.nextLine();

            System.out.println("Enter a months: ");
            int months = sc.nextInt(); sc.nextLine();

            InterestService is = new BrasilInterestService(2.0); // Instância com a taxa de juros do BR
            InterestService isUsa = new UsaInterestService(1.0); // Instância com a taxa de juros do BR

            System.out.println(is.payment(months, amount));
            System.out.println(isUsa.payment(months, amount));
        }
    }
}
