package comportamentoMemoria.arrays.List.exerciseTreino.entities;

import java.util.List;

public class AccountService {

    public Account findById(List<Account> list, int number) {
        Account num = list.stream().filter(x -> x.getNumber() == number).findFirst().orElse(null);
        return num;
    }

    public void deposit(List<Account> list, int num, double amount) {
        Account acc = findById(list, num);
        if (acc == null) {
            throw new IllegalArgumentException("Número da conta é inválido!");
        }

        acc.deposit(amount);
    }

    public void withdraw(List<Account> list, int num, double amount) {
        Account acc = findById(list, num);

        if (acc == null) {
            throw new IllegalArgumentException("Número da conta é inválido!");
        }

        acc.withdraw(amount);
    }
}
