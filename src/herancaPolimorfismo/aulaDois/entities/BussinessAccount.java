package herancaPolimorfismo.aulaDois.entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount() {
        super();
    }

    // Construtor deve ter ambos os argumentos

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loanLimit(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }
}