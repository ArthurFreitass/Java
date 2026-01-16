package comportamentoMemoria.arrays.List.exerciseTreino.entities;

public class Account {

    private final Integer number;
    private String holder;
    private Double balance;

    public Account(int number, String holder) {
        if (holder == null || holder.isEmpty()) {
            throw new IllegalArgumentException("Valor inválido no nome");
        }

        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public String toString() {
        return "Conta "+ number + ", "+ holder + ", Saldo $ "+ String.format("%.2f", balance);
    }
}
