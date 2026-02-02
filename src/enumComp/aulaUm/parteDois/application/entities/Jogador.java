package enumComp.aulaUm.parteDois.application.entities;

public class Jogador {

    private String name;
    private int num;
    private Titles title;

    public Jogador(String name, int num, Titles title) {
        this.name = name;
        this.num = num;
        this.title = title;
    }

    public String toString() {
        return name + " " +num + " " +title;
    }
}
