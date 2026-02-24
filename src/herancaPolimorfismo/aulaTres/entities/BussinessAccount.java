package sobreposicaoOverrideSuper.entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount() {
        super();
    }

    public BussinessAccount(int num, String holder, double balance, double loanLimit) {
        super(num, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
