package tratamentoExcecoes.revisao.model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if (number < 0) {
            throw new DomainException("Erro: O número da conta não pode ser negativo!");
        }
        if (number == null) {
            throw new DomainException("Erro: O número da conta não pode ser nulo!");
        }
        if (holder == null || holder.isEmpty()) {
            throw new DomainException("Erro: O nome do titular da conta não pode ser nulo ou vazio!");
        }
        if (balance == null) {
            throw new DomainException("Erro: O saldo na conta não pode ser nulo!");
        }
        if (balance < 0) {
            throw new DomainException("Erro: O saldo na conta não pode ser negativo!");
        }
        if (withdrawLimit == null) {
            throw new DomainException("Erro: O limite de saque da conta não pode ser nulo!");
        }
        if (withdrawLimit < 0) {
            throw new DomainException("Erro: O limite de saque da conta não pode ser negativo!");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new DomainException("Erro: A quantia para deposito deve ser maior que zero!");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new DomainException("Erro: A quantia para saque não pode ser negativa!");
        }
        if (amount > withdrawLimit) {
            throw new DomainException("Erro: A valor a ser sacado não pode ser superior ao seu limite de saque!");
        }
        if (balance < amount) {
            throw new DomainException("Erro: Saldo insuficiente!");
        }
        balance -= amount;
    }
}
