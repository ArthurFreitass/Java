package enumComp.exercicios.Dois.entities;

import java.time.LocalDate;
import java.util.Locale;

public class ContractService {

    private static double FEES = 0.01;
    private static double TAX = 0.02;

    public void processContract(Contract contract, int months) {
        // Fazer o cálculo básico

        double valueBase = contract.getTotalValue() / months;

        // Fazer o cálculo de cada parcela

        for (int i = 1; i <= months; i++) {
            double fees = valueBase * FEES * i;
            double valueWithInterest = valueBase + fees;
            double tax = valueWithInterest * TAX;
            double finalValue = valueWithInterest + tax;

            LocalDate baseDate = contract.getDate(); // Pega o objeto
            LocalDate date = baseDate.plusMonths(i); // Adiciona parcela

            Installment installment = new Installment(date, finalValue);
            contract.addInstallment(installment);
        }
    }
}
