package comportamentoMemoria.arrays.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("Ippo");
        names.add("Miyata");
        names.add("Takamura");
        names.add("Kimura");
        names.add("King");
        names.add("Aoki");
        names.add("Ashura");
        names.add("Sasuke");
        names.add("Shoto");
        names.add("Kuririn");

        System.out.println("Add Out: [Names] [Length]");

        for (String obj : names) {
            System.out.println(obj);
        }

        System.out.println(names.size() + "\n-------------------");

        // Remove

        names.remove("Kuririn"); // - Poderia ser indice

        names.removeIf(x -> x.charAt(0) == 'S');

        System.out.println("Remove Out:");

        for (String obj : names) {
            System.out.println(obj);
        }

        // IndexOf

        System.out.println("-------------------");

        System.out.println("IndexOf Miyata: "+ names.indexOf("Miyata"));

        System.out.println("----------------");

        // Remove all except A

        List<String> result = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toUnmodifiableList());

        System.out.println("Out result:");

        for (String obj : result) {
            System.out.println(obj);
        }

        // Finding an element

        System.out.println("----------------");

        String firstElement = names.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);

        System.out.println(firstElement);
    }
}
