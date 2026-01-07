package orientacaoObjetos.revisao.exercicioUm.application;

import orientacaoObjetos.revisao.exercicioUm.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount user = new BankAccount();

        System.out.print("Enter the name of an owner: ");
        user.owner = sc.nextLine();

        System.out.print("Enter your current account balance: ");
        user.balance = sc.nextDouble();

        System.out.println("\n"+user);

        System.out.print("\nEnter a deposit amount: ");
        double amount = sc.nextDouble();

        user.deposit(amount);

        System.out.print("\nEnter a with draw amount: ");
        amount = sc.nextDouble();

        user.withDraw(amount);

        System.out.println("\n"+user);
    }
}
