package interfaces.interfaceComparable.model.entities;

public class People {

    private String name;

    public People(){
    }

    public People(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new RuntimeException("Error: Name cannot be null or empty");
        this.name = name;
    }
}
