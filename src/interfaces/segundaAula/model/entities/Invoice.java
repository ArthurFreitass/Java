package interfaces.segundaAula.primeiraRefatoracao.model.entities;

import interfaces.segundaAula.primeiraRefatoracao.model.exceptions.DomainException;

public class Invoice {

    private Double basicPay;
    private Double tax;

    public Invoice(Double basicPay, Double tax) {
        if (basicPay <= 0) {
            throw new DomainException("Error: Basic pay cannot be less or than zero!");
        }
        if (tax <= 0) {
            throw new DomainException("Error: Tax pay cannot be less or than zero!");
        }
        this.basicPay = basicPay;
        this.tax = tax;
    }

    public Double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(Double basicPay) {
        if (basicPay <= 0) {
            throw new DomainException("Error: Basic pay cannot be less or than zero!");
        }
        this.basicPay = basicPay;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        if (tax <= 0) {
            throw new DomainException("Error: Tax pay cannot be less or than zero!");
        }
        this.tax = tax;
    }

    public double totalPayment() {
        return basicPay + tax * basicPay;
    }
}
