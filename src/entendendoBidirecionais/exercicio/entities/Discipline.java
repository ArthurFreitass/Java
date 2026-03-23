package bidirecionais.entities;

import bidirecionais.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;

public class Discipline {

    private String name;
    private List<Student> studentList;

    private Discipline() {
    }

    public Discipline(String name) {
        if (name == null || name.isEmpty()) {
            throw new DomainException("Error: Discipline name cannot be null or empty");
        }
        studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentList(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
        }
    }

    public void removeStudentList(Student student) {
        studentList.remove(student);
    }
}
