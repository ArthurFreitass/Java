package interfaces.terceiraAula.terceiraRefatoracao.model.service;

public class BrasilTaxService implements TaxService {

    public BrasilTaxService() {
    }

    public double tax(double amount) {
        if (amount > 100.0) {
            return amount * 0.15;
        }
        return amount * 0.2;
    }
}