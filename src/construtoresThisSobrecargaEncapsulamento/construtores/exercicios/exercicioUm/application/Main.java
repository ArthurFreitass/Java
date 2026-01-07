package construtoresThisSobrecargaEncapsulamento.construtores.exercicios.exercicioUm.application;

import construtoresThisSobrecargaEncapsulamento.construtores.exercicios.exercicioUm.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Create your bank account");
        System.out.println("========================\n");

        System.out.println("Enter your unique account number: ");
        int number = sc.nextInt();

        System.out.println("\nEnter your account holder name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("\nEnter your current balance now: ");
        double balance = sc.nextDouble();

        // Instanciando

        Account acc = new Account(number, name, balance);

        // Trazer os métodos

        System.out.println("\nEnter an amount to make a deposit: ");
        int amount = sc.nextInt();

        acc.deposit(amount);

        System.out.println("\nEnter an amount to make a withdrawal: ");
        amount = sc.nextInt();

        acc.withdraw(amount);

        System.out.println("\nAccount data: Number "+ acc.getNumber() + " Holder " + acc.getHolder() + " Balance " + acc.getBalance());

    }
}
