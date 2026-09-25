package lambda.pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6 ,7, 8, 9, 10);

        Stream<Integer> st1 = integerList.stream().map(n -> n * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        double multi = integerList.stream().reduce(1, (x, y) -> x * y);

        System.out.println("Multiplication " + multi);

        List<Integer> listBig10 = integerList.stream().filter(x -> x > 6).map(x -> x - 1).toList();

        System.out.println(listBig10);
    }
}
