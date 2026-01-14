package comportamentoMemoria.arrays.List.entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        if (isValid(id, name, salary)) {

            this.name = name;
            this.salary = salary;
        } else {
            this.name = "DADO_INVÁLIDO";
            this.salary = 0.0;
        }
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isValid(int id, String name, double salary) {
        return name != null && !name.isEmpty() && salary > 0;
    }


    public void increaseSalary(double increase) {
        if (increase > 0) {
            salary += (increase / 100) *  salary;
        }
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
