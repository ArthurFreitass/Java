package interfaces.segundaAula.segundaRefatoracao.entities;

import interfaces.segundaAula.segundaRefatoracao.exceptions.DomainException;

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
        return basicPay + tax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pagamento básico: "+ String.format("%.2f", getBasicPay()));
        sb.append("\nImposto: "+ String.format("%.2f", getTax()));
        sb.append("\nPagamento total: "+ String.format("%.2f", totalPayment()));
        return sb.toString();
    }
}