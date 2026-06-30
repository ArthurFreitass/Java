package generics.revision.application;

import generics.revision.entities.Printer;

public class Main {
    public static void main(String[] args) {

        Printer<String> p = new Printer();

        p.addInList("Arthur");
        p.addInList("Breno");
        p.addInList("Richard");

        p.print();

        System.out.println();

        p.removeInList(0);
        p.removeInList(1);

        p.print();
    }
}
