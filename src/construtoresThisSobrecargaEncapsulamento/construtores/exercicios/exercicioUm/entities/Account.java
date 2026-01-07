package construtoresThisSobrecargaEncapsulamento.construtores.exercicios.exercicioUm.entities;

public class Account {

    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double balance) {

        this.number = number;

        if (holder != null && !holder.isEmpty()) {
            this.holder = holder;
        } else {
            this.holder = "A confirmar";
        }
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        if (holder != null && !holder.isEmpty()) {
            this.holder = holder;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("\nERROR: It cannot be less than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("\nERROR: You cannot withdraw an amount greater than your balance.");
        }
    }
}
