package generics.set.firstClass;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(123);

        // Set é uma estrutura de dados que não permite repetidos

        set.add(123); //  Não é adicionado

        set.add(211);

        set.add(11);

        for (Object item : set) {
            System.out.println(item);
        }

        System.out.println("\n11 exists in Set " + set.contains(11));
        System.out.println();

        set.remove(211); // Removeu o 211

        set.add(500);
        set.add(132);

        for (Object item : set) {
            System.out.println(item);
        }

        set.removeIf(x -> x < 100); // Remove todos com base em um predicado

        System.out.println("\n"+set);
    }
}
