package generics.set.exercise.model.entities;

import generics.set.exercise.model.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private String name;
    List<Course> courseList;

    public Instructor(String name) {
        setName(name);
        courseList = new ArrayList<>();
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

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
