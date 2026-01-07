package construtoresThisSobrecargaEncapsulamento.construtores.exercicioFixacao.entities;

public class BankAccount {

    private final int numberAccount;
    private String holderName;
    private double balance;
    private static final double TAX = 5.00;

    public BankAccount(int numberAccount, String holderName) {
        this.numberAccount =  numberAccount;
        if (holderName != null && !holderName.isEmpty()) {
            this.holderName = holderName;
        } else {
            this.holderName = "A confirmar";
        }
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String name) {
        if (name!= null && !name.isEmpty()) {
            this.holderName = name;
        }

        // Deposito e Saque

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount + TAX;
        }
    }

    public String toString() {
        return
                "Account "+
                getNumberAccount() +
                ", Holder: " +
                getHolderName() +
                ", Balance: $ " +
                String.format("%.2f", getBalance());
    }
}
