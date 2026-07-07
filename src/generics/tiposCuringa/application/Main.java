package generics.tiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Qual é o Supertipo de List

        List<Integer> listInt = new ArrayList<>();

        listInt.add(10);
        listInt.add(21);
        listInt.add(5);
        listInt.add(0);
        listInt.add(19);
        listInt.add(13);

        // List<Object não é o supertipo de List<>
        // Resulta em erro list = listInt;

        // <List<?>>

        List<String> stringList = Arrays.asList("GTR34", "Maxda RX7");

        System.out.println("\n"+listConcat(listInt));
        System.out.println(listConcat(stringList));

        // Só é possível receber uma List<?> e não adicionar valores.
    }

    // Fazer um método que concatena a List

    static String listConcat(List<?> list) {
        String message = "";
        for (Object obj : list) {
            message += obj;
        }
        return message;
    }
}
