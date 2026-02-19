package enumComp.exercicios.Dois.service;

import enumComp.exercicios.Dois.entities.Contract;

public class ContractService {

    private static double FEES = 0.01;
    private static double PAYMENT_RATE = 0.02;

    public double processContract(Contract contract, int months) {
        double baseValue = contract.getTotalValue() / months;
        double valueWithInterest = baseValue + (baseValue * FEES * months);
        double totalValue = valueWithInterest + (valueWithInterest * PAYMENT_RATE * months);
        return totalValue;
    }
}
