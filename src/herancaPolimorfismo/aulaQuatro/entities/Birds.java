package polimorfismo.entities;

public class Birds extends  Animal {

    private String species;

    public Birds() {}

    public Birds(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toFly() {
        return "Estou voando!";
    }
}
