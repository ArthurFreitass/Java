package generics.set.exercise.model.entities;

import generics.set.exercise.model.exceptions.DomainException;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private String name;
    Set<User> users;

    public Course(String name) {
        setName(name);
        users = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new DomainException("Name course cannot be null");
        }
        if (name.isEmpty()) {
            throw new DomainException("Name course cannot be empty");
        }
        this.name = name;
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void removeUser(User u) {
        users.remove(u);
    }

    public Set<User> getUsers() {
        return users;
    }
}
