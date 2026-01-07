package orientacaoObjetos.revisao.exercicioUm.entities;

public class BankAccount {
    public String owner;
    public double balance;
    public final double tax = 5.00;

    public void deposit(double amount) {
        if (isValidOperation(amount)) {
            balance += amount;
        }
    }

    public void withDraw(double amount) {
        if (isValidOperation(amount) && amount + tax <= balance) {
            balance -= amount + tax;
        }
    }

    public boolean isValidOperation(double amount) {
        return amount > 0;
    }

    public String toString() {
        return "Account owner: "+ owner+ "\nFinal balance: $ " + balance;
    }
}
