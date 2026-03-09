package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if (number == null || holder.isEmpty() || holder == null || balance == null ||withdrawLimit == null) {
            throw new DomainException("Error: You cannot enter any null data.");
        }
        if (balance < 0) {
            throw new DomainException("Error: The account balance cannot be negative.");
        }
        if (withdrawLimit < 0) {
            throw new DomainException("Error: The account withdraw cannot be negative.");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
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

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new DomainException("Error: The minimum deposit amount for an account is $0.01.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new DomainException("Error: The withdrawal amount must be greater than zero.");
        }
        if (balance == 0) {
            throw new DomainException("Error: To make a withdrawal, there must be a balance in the account.");
        }
        if (balance < amount) {
            throw new DomainException("Error: The balance in your account must be higher than the expected withdrawal amount.");
        }
        if (amount > withdrawLimit) {
            throw new DomainException("Error: The withdrawal amount cannot exceed the withdrawal limit set.");
        }
        balance -= amount;
    }
}
