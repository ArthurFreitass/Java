package bidirecionais.entities;

import bidirecionais.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private Integer age;
    private String address;

    private List<Discipline> disciplineList;

    public Student() {
    }

    public Student(String name, Integer age, String address) {
        checkIsValid(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        disciplineList = new ArrayList<>();
    }

    public Integer getAge() {
        return age;
    }

    public List<Discipline> getDisciplineList() {
        return disciplineList;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void checkIsValid(String name, Integer age, String address) {
        if (name == null) {
            throw new DomainException("Error: Name cannot be null");
        }
        if (age == null) {
            throw new DomainException("Error: Age cannot be null");
        }
        if (address == null) {
            throw new DomainException("Error: Adress cannot be null");
        }

        if (name.isEmpty()) {
            throw new DomainException("Error: Name cannot be empty");
        }
        if (address.isEmpty()) {
            throw new DomainException("Error: Address cannot be empty");
        }
        if (age < 0 || age < 12) {
            throw new DomainException("Error: Age must be greater than 11");
        }
    }

    // Matrícula

    public void enroll(Discipline discipline) {
        if (!disciplineList.contains(discipline)) {
            disciplineList.add(discipline);
            discipline.addStudentList(this); // Adiciona a lista de estudantes
        }
    }

    public void cancelRegistration(Discipline discipline) {
        if (disciplineList.contains(discipline)) {
            disciplineList.remove(discipline); // Já remove aqui
            discipline.removeStudentList(this);
        }
    }
}
