package enumComp.exercicios.Dois.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer numbers;
    private LocalDate date;
    private Double totalValue;

    // Composição

    private List<Installment> installmentList = new ArrayList<>();

    public Contract(int numbers, LocalDate date, double totalValue) {
        this.numbers = numbers;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void addInstallment(Installment installment) {
        installmentList.add(installment);
    }
}
