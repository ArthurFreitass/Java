package generics.map.exercise.model.entities;

import generics.map.exercise.model.exceptions.DomainException;

import java.util.Objects;

public class Candidate {

    private String name;

    public Candidate(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null) {
            throw new DomainException("Name candidate cannot be null");
        }
        if (name.isEmpty()) {
            throw new DomainException("Name candidate cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
