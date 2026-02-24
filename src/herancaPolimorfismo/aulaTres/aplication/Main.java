package sobreposicaoOverrideSuper.application;

import sobreposicaoOverrideSuper.entities.Account;
import sobreposicaoOverrideSuper.entities.BussinessAccount;
import sobreposicaoOverrideSuper.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(300);

        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(2002, "Xela", 1000.0, 0.01);

        if (acc2 instanceof  SavingsAccount) {
            ((SavingsAccount) acc2).updateBalance();
            acc2.withdraw(200);
        }

        System.out.println("\n" + acc2.getBalance());

        BussinessAccount acc3 = new BussinessAccount(3003, "Kate", 1000.0, 800.0);
        acc3.withdraw(500);

        System.out.println("\n" + acc3.getBalance());
    }
}
