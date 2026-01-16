package comportamentoMemoria.arrays.List.exerciseTreino.application;

import comportamentoMemoria.arrays.List.exerciseTreino.entities.Account;
import comportamentoMemoria.arrays.List.exerciseTreino.entities.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de contas que serão criadas: ");
        int nAccounts = sc.nextInt();

        if (nAccounts > 0) {
            // Inicia a List

            List<Account> acc = new ArrayList<Account>();

            System.out.println("\nEntre com os dados de cada conta");
            System.out.println("--------------------------------");
            for (int i = 0; i < nAccounts; i++) {
                System.out.println(i + 1 + "# account");

                System.out.print("Número da conta: ");
                int number = sc.nextInt();
                sc.nextLine();

                System.out.print("Nome do titular: ");
                String name = sc.nextLine();

                // Instância o objeto

                acc.add(new Account(number, name));
                System.out.println();
            }

            System.out.println("\nEntre com o número de uma conta para efetuar uma operação: ");
            int num = sc.nextInt();

            AccountService accountService = new AccountService(); // Cria o objeto da outra classe

            Account numAccount = accountService.findById(acc, num);

            if (numAccount != null) {
                System.out.print("\nEscolha uma operação [1 - Depósito] [2 - Saque]: ");
                int option = sc.nextInt();

                if (isValidChoice(option)) {
                    if (option == 1) {
                        System.out.print("\nDigite o valor do depósito: ");
                        double amount = sc.nextDouble();
                        accountService.deposit(acc, numAccount.getNumber(), amount);
                        System.out.println("\n\nDepósito de $ "+ String.format("%.2f", amount) + " realizado");
                    } else {
                        System.out.print("\nDigite o valor do saque: ");
                        double amount = sc.nextDouble();
                        accountService.withdraw(acc, numAccount.getNumber(), amount);
                        System.out.println("\n\nSaque de $ "+ String.format("%.2f", amount) + " realizado");
                    }
                } else {
                    System.out.println("\nERRO: Opção inválida, escolha [1 - Depósito] [2- Saque].");
                }
            }

            // Saída final

            System.out.println("\nListando todas as contas");
            System.out.println("------------------------");

            for (Account obj : acc) {
                System.out.println(obj);
            }

        } else {
            System.out.println("ERRO: Ao menos uma conta deve ser criada!");
        }
    }

    static boolean isValidChoice(int option) {
        return option == 1 || option == 2;
    }
}
