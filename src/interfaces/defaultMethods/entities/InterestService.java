package interfaces.defaultMethods.entities;

public interface InterestService {

    double getInterestRate();

    default double payment(int months, double amount) {
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    } // Método padrão na interface
}
