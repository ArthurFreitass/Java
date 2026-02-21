package herancaPolimorfismo.aulaUm.application;

import herancaPolimorfismo.aulaUm.entities.BussinessAccount;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        BussinessAccount bAccount = new BussinessAccount(1, "DK", 1000.2, 3000.1);
        bAccount.deposit(500.1);
        System.out.println(String.format("%.2f", bAccount.getBalance()));
    }
}
