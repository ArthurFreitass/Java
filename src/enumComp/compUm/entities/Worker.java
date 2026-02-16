package enumComp.compUm.entities;

import enumComp.compUm.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double salary;

    private Departament departament;

    public Worker(String name, WorkerLevel level, double salary, Departament departament) {
        this.name = name;
        this.level = level;
        this.salary = salary;
        this.departament = departament;
    }

    private List<HourContract> contracts = new ArrayList<>(); // instanciando o objeto


    public WorkerLevel getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = salary;
        for (HourContract hourContract : contracts) {
            int yearContract = hourContract.getDate().getYear();
            int monthContract  = hourContract.getDate().getMonthValue();

            if (year == yearContract && month == monthContract) {
                salary += hourContract.totalValue();
            }
        }
        return salary;
    }
}
