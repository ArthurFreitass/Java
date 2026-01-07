package construtoresThisSobrecargaEncapsulamento.construtores.exercicioFixacao.application;

import construtoresThisSobrecargaEncapsulamento.construtores.exercicioFixacao.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        BankAccount acc = new BankAccount(number, holder);

        System.out.print("Is there an initial deposit (y/n)? ");
        char choice = sc.next().charAt(0);

        double amount;

        if (choice == 'y') {

            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            acc.deposit(amount);
        }

            // Saída
        System.out.println("\nAccount data:\n" + acc);

        System.out.print("\nEnter a deposit value: ");
        amount = sc.nextDouble();

        acc.deposit(amount);

        System.out.println("Update account data:\n"+ acc);

        System.out.print("\nEnter a withdraw value: ");
        amount = sc.nextDouble();

        acc.withdraw(amount);
        System.out.println("Update account data:\n"+ acc);

        sc.close();
    }
}
