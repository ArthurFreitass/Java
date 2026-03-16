package tratamentoExcecoes.revisao.application;

import tratamentoExcecoes.revisao.model.entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter a account data:");
            System.out.print("Number: ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account acc = new Account(num, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            acc.withdraw(amount);
            System.out.println("New Balance: " + acc.getBalance());

        } catch (model.exceptions.DomainException error) {
            System.out.println(error.getMessage());
        } catch (Exception error) {
            System.out.println("Unexpected error!");
        } finally {
            sc.close();
        }
    }
}
