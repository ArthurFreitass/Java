package generics.equalsHashCode.fistClass;

public class Main {
    public static void main(String[] args) {

        // Método Equals 100% confiável

        Integer x = 10;
        Integer y = 11;

        System.out.println(x.equals(11));

        System.out.println();

        // HashCode não 100% confiável - mas muito rápido

        System.out.println(x.hashCode() == y.hashCode());
    }
}
