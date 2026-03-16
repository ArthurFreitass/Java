package herancaPolimorfismo.exercicio.entities;

public class NaturalPerson extends Taxpayers {

    private Double healthcareExpenses;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double incomeAnnual, Double healthcareExpenses) {
        super(name, incomeAnnual);
        if (healthcareExpenses < 0) {
            throw new IllegalArgumentException("Error: Healthcare spending should be equal to or greater than zero");
        }
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    private static final double MIN_TAX = 0.15;
    private static final double MAX_TAX = 0.25;

    @Override
    public double tax() {
        double taxToPay = getIncomeAnnual() < 20000.00 ? getIncomeAnnual() * MIN_TAX : getIncomeAnnual() * MAX_TAX;
        if (healthcareExpenses == 0) {
            return Math.max(0, taxToPay);
        } else {
            double percentageHealthSpending = healthcareExpenses * 0.5;
            taxToPay -= percentageHealthSpending; // Corrigir
            return Math.max(0, taxToPay);
        }
    }
}
