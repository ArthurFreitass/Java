package generics.solvedExercise.myVersion.model.entities;

import model.exceptions.DomainException;

import java.time.Instant;
import java.util.Objects;

public class Log {

    private String name;
    private Instant instantLog;

    public Log(String name, Instant instantLog) {
        setName(name);
        this.instantLog = instantLog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new DomainException("Error name cannot be null or empty!");
        }
        this.name = name;
    }

    public Instant getInstantLog() {
        return instantLog;
    }

    public void setInstantLog(Instant instantLog) {
        if (instantLog == null) {
            throw new DomainException("Error instant log cannot be null!");
        }
        this.instantLog = instantLog;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(name, log.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
