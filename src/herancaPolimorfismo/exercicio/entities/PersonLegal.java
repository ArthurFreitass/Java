package exercicio.entities;

public class PersonLegal extends Taxpayers {

    private Integer numberEmployees;

    public PersonLegal() {
    }

    public PersonLegal(String name, Double incomeAnnual, Integer numberEmployees) {
        super(name, incomeAnnual);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    private static final double NORMAL_TAX = 0.16;
    private static final double MIN_TAX = 0.14;

    @Override
    public double tax() {
        double taxToPay = (numberEmployees > 10) ? getIncomeAnnual() * MIN_TAX : getIncomeAnnual() * NORMAL_TAX;
        return taxToPay;
    }
}
