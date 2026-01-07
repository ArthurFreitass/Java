package orientacaoObjetos.membrosEstaticos.exercicioFixacaoTres.entities;

public class BankAccount {

    public double balance;

    // Depende do objeto - Altera o estado
    public void deposit(double balance) {
        this.balance += balance;
    }

    public double getBalance() {
        return balance;
    }
}
