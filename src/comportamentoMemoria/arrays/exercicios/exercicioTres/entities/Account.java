package comportamentoMemoria.arrays.exercicios.exercicioTres.entities;

public class Account {

    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        if (holder != null && !holder.isEmpty()) {
            this.holder = holder;
        } else {
            this.holder = "A confirmar";
        }

        if (balance > 0 ) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void withdraw(double value) {
        if (balance >= value) {
            balance -= value;
        }
    }

    public void deposit(double value) {
        if (balance >= value) {
            balance += value;
        }
    }
}
