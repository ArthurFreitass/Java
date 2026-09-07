package lambda.interfaceFuncional.predicate.entities;

public class Person {

    private String name;
    private Double height;

    public Person(String name, Double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // Static method
    public static boolean staticBooleanPredicate(Person person) {
        return person.getHeight() < 1.75;
    }

    // No static method
    public boolean nostaticBooleanPredicate() {
        return getHeight() < 1.75;
    }

    @Override
    public String toString() {
        return name + " Height: " + String.format("%.2f", height);
    }
}
