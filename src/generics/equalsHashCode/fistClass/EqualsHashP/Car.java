package generics.equalsHashCode.fistClass.EqualsHashP;

import java.util.Objects;

public class Car {

    private Integer year;
    private String name;
    private String model;

    public Car(Integer year, String name, String model) {
        this.year = year;
        this.name = name;
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }
}
