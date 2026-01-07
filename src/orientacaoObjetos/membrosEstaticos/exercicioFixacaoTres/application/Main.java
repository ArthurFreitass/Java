package orientacaoObjetos.membrosEstaticos.exercicioFixacaoTres.application;

import orientacaoObjetos.membrosEstaticos.exercicioFixacaoTres.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Necessário instanciar um objeto
        BankAccount user = new BankAccount();

        System.out.print("Enter your current balance: ");
        user.balance = sc.nextDouble();

        System.out.print("\nEnter the deposit amount: ");
        double amount = sc.nextDouble();

        user.deposit(amount);

        System.out.printf("\nBALANCE $ %.2f", user.getBalance());
    }
}
