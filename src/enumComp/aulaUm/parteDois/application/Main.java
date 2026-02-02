package enumComp.aulaUm.parteDois.application;

import enumComp.aulaUm.parteDois.application.entities.Jogador;
import enumComp.aulaUm.parteDois.application.entities.Titles;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cristiano Ronaldo", 7, Titles.LENDA);
        System.out.println(j1);
    }
}
