package enumComp.exercicios.Dois.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate date;
    private Double amount;

    public Installment(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Date : " + date + "\nAmount " + amount;
    }
}
