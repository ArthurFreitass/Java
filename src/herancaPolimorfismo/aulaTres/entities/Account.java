package sobreposicaoOverrideSuper.entities;

public class Account {

    private Integer num;
    private String holder;
    protected Double balance;

    public Account(){
    }

    public Account(int num, String holder, double balance) {
        this.num = num;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
}
