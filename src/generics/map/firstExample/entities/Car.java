package generics.map.firstExample.entities;

import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private Double price;

    public Car(String name, String model, Double price) {
        this.name = name;
        this.model = model;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price);
    }

    @Override
    public String toString() {
        return name + " " + model;
    }
}
