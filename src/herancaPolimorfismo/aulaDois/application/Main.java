package herancaPolimorfismo.aulaDois.application;

import herancaPolimorfismo.aulaDois.entities.Account;
import herancaPolimorfismo.aulaDois.entities.BussinessAccount;
import herancaPolimorfismo.aulaDois.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // Instânciando Accounts

        Account acc = new Account(1001, "Sasuke", 300.0);
        BussinessAccount bAcc = new BussinessAccount(1002, "Harvey Specter", 10000.0, 5000.14);

        // UpCasting

        Account acc1 = bAcc;
        Account acc2 = new BussinessAccount(1003, "Luffy", 100.2, 1000.1);
        Account acc3 = new SavingsAccount(1004, "Sasuke", 344.1, 3323.2);

        // DownCasting

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loanLimit(200);

       // Culmina em um erro BussinessAccount acc5 = (BussinessAccount) acc3;

        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loanLimit(200);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
