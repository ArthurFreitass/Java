package exercicioProposto.entities;

public class OutSourceEmployee extends Employee {

    // Têm apenas um método adicional

    private double additionalCharge;

    public OutSourceEmployee(){
        super();
    }

    public OutSourceEmployee(String name, int hours, double valuePerHours, double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        double bonus = additionalCharge * 110 / 100;
        return super.payment() + bonus;
    }

    @Override
    public String toString() {
        return name + " " + " $ " + String.format("%.2f", payment());
    }
}
