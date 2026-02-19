package enumComp.exercicios.Dois.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer numbers;
    private LocalDate date;
    private Double totalValue;

    // Associações
    List<Installment> installment = new ArrayList<>();

    public Contract(int numbers, LocalDate date, double totalValue) {
        this.numbers = numbers;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void addInstallment(Installment installment) {
        this.installment.add(installment);
    }

    public List<Installment> getInstallment() {
        return installment;
    }

}
