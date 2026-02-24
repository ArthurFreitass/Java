package polimorfismo.entities;

public class Dogs extends Animal {

    private String species;

    public Dog(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String auau() {
        return "Estou latindo!";
    }
}
