package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the account data:");
            System.out.print("Number: ");
            int numAccount = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account acc = new Account(numAccount, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            acc.withdraw(amount);
            System.out.println("New balance: "+ String.format("%.2f", acc.getBalance()));
        } catch (DomainException error) {
            System.out.println(error.getMessage());
        } catch (RuntimeException error) {
            System.out.println("Unexpected error!");
        } finally {
            sc.close();
        }
    }
}
