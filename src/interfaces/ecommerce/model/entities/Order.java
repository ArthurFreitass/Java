package ecommerce.model.entities;

import ecommerce.model.exceptions.DomainException;
import java.time.LocalDate;

public class Order {

    private Integer number;
    private LocalDate date;
    private Double baseValue;
    private String customerName;

    public Order() {
    }

    public Order(Integer number, LocalDate date, Double baseValue, String customerName) {
        setNumber(number);
        setDate(date);
        setBaseValue(baseValue);
        setCustomerName(customerName);
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Double baseValue) {
        if (baseValue <= 0) {
            throw new DomainException("Error: Basic value cannot be less or than equal zero!");
        }
        this.baseValue = baseValue;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if (date == null) {
            throw new DomainException("Error: Date cannot be null");
        }
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        if (number <= 0) {
            throw new DomainException("Error: Order number cannot be less or than equal zero!");
        }
        this.number = number;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) {
            throw new DomainException("Erro: Customer name cannot be null or empty");
        }
        this.customerName = customerName;
    }
}
