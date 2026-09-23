package lambda.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Jiraya", "Isagi", "Hugo", "Julian Locki", "Ichigo");

        Stream<String> st1 = names.stream().map(x -> x + " aaa");

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 =  Stream.iterate(0, x -> x + 3);
        System.out.println(Arrays.toString(st2.limit(8).toArray()));

        // Fibonacci

        Stream<Long> st4 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
