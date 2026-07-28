package generics.set.exercise.model.entities;

import generics.set.exercise.model.exceptions.DomainException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {

    private String name;
    private List<Course> courseList;
    private Set<User> students = new HashSet<>();

    public Instructor(String name) {
        setName(name);
        courseList = new ArrayList<>(); // Array de cursos
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new DomainException("Name instructor cannot be empty");
        }
        this.name = name;
    }

    public void addCourses(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public Set<User> getStudents() {
        for (int i = 0; i < courseList.size(); i++) {
            students.addAll(courseList.get(i).getUsers());
        }
        return students;
    }
}
