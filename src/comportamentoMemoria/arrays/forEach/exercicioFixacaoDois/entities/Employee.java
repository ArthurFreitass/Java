package comportamentoMemoria.arrays.forEach.exercicioFixacaoDois.entities;

public class Employee {

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void applyIncrease() {
        if (salary < 3000.0) {
            salary += salary * 0.1;
        } else {
            salary += salary * 0.05;
        }
    }

    public String toString() {
        return "Funcionário : - " + name + " Salário final $ "+ salary;
    }
}
