package generics.set.firstClass.ConjuntsOperations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> a = new TreeSet<>(Arrays.asList("Isagi", "Shidou", "Kunigami", "Michael Kaiser"));
        Set<String> b = new TreeSet<>(Arrays.asList("Julian Locki", "Charles Chavelier", "Hugo"));
        Set<String> c = new TreeSet<>(Arrays.asList("Charles Chavelier", "Hugo", "Isagi"));

        // Union operação

        a.addAll(b);

        printer(a);

        // Intersection

        System.out.println();

        c.retainAll(b);

        printer(c);

        Set<String> d = new TreeSet<>(a);

        // Difference
        // a - b

        d.removeAll(b);

        System.out.println();
        printer(d);

    }

    private static void printer(Set<?> set) {
        for (Object item : set) {
            System.out.println(item);
        }
    }
}
