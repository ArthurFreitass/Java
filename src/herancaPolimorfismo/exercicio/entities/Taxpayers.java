package herancaPolimorfismo.exercicio.entities;

public abstract class Taxpayers {

    private String name;
    private Double incomeAnnual;

    public Taxpayers() {
    }

    public Taxpayers(String name, Double incomeAnnual) {
        this.name = name;
        this.incomeAnnual = incomeAnnual;
    }

    public String getName() {
        return name;
    }

    public Double getIncomeAnnual() {
        return incomeAnnual;
    }

    public abstract double  tax();

    public String toString() {
        return name + " $ " + String.format("%.2f", tax()) + "\n";
    }
}
