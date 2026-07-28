package generics.set.exercise.model.entities;

import generics.set.exercise.model.exceptions.DomainException;

import java.util.Objects;

public class User {

    private Integer code;

    public User(Integer code) {
        setCode(code);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        if (code == null) {
            throw new DomainException("Your user code cannot be null");
        }
        if (code <= 0) {
            throw new DomainException("Your user code cannot be less or than equal zero");
        }
        this.code = code;
    }

    // Métodos que checam se o usuário é o mesmo

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(code, user.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "" + code;
    }
}
