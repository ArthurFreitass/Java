package generics.curingasDelimitados.secondExample.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Refatoration {
    public static void main(String[] args) {

        try {

            List<Object> listObj = new ArrayList<>();
            copyElements(getListInt(), listObj);
            copyElements(getListDouble(), listObj);

            System.out.println(listObj);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
                                    // Covariância                    // Contravariância
    private static void copyElements(List<? extends Number> listNums, List<? super Number> listObj) {
        for (Number item : listNums) {
            listObj.add(item);
        }
    }

    private static List<Integer> getListInt() {
        List<Integer> myListInt = Arrays.asList(100,23,13,45);
        return myListInt;
    }


    private static List<Double> getListDouble() {
        List<Double> myListDouble = Arrays.asList(14.3, 2.0, 11.1, 45.6);
        return myListDouble;
    }

    private void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
