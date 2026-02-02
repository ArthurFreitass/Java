package enumComp.aulaDois.application.entities;

import enumComp.aulaDois.application.entities.enums.WorkerLevel;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações

    private Departament departament;
    private List<HourContract> list = new ArrayList<>();

    // -

    public Worker(String name, WorkerLevel level, Double salary,  Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = salary;
        this.departament = departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getList() {
        return list;
    }

    public void addContract(HourContract contract) {
        list.add(contract);
    }

    public void removeContract(HourContract contract) {
        list.remove(contract);
    }

    public double income(int year, int mounth) {
        double sum = baseSalary;
        for (HourContract c : list) {
            int yearDate = c.getDate().getYear();
            int mounthDate = c.getDate().getMonthValue();

            if (yearDate == year && mounthDate == mounth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
