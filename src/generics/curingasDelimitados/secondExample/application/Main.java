package generics.curingasDelimitados.secondExample.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            List<Integer> integerList = getListInt();
            List<Double> doubleList = getListDouble();

            List<Object> objectListInt = copyElements(integerList);
            System.out.println("Copied integer elements" + objectListInt);

            List<Object> copiedElements = copyElements(doubleList);
            System.out.println("Copied double elements" + copiedElements);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<Object> copyElements(List<? extends Object> list) {

        List<Object> objectList = new ArrayList<>(); // Cria a lista de Objects

        for (Object item : list) {
            objectList.add(item);
        }

        return objectList;
    }

    private static List<Integer> getListInt() {
        List<Integer> myListInt = Arrays.asList(100,23,13,45);
        return myListInt;
    }


    private static List<Double> getListDouble() {
        List<Double> myListDouble = Arrays.asList(14.3, 2.0, 11.1, 45.6);
        return myListDouble;
    }
}
