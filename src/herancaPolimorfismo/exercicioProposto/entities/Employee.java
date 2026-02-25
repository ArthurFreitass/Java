package exercicioProposto.entities;

public class Employee {

    protected String name;
    private int hours;
    private double valuePerHour;

    public Employee() {
    }

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValuePerHour(double salary) {
        this.valuePerHour = salary;
    }

    public Double payment() {
        return valuePerHour * hours;
    }

    public String toString() {
        return name + " " + " $ " + String.format("%.2f", payment());
    }
}
