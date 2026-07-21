package generics.equalsHashCode.fistClass.EqualsHashP;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(2026, "Civic", "Sedan");
        Car car2 = new Car(2020, "GTR34", "Sedan");
        Car car3 = new Car(2026, "Civic", "Sedan");

        System.out.println(car3.equals(car1));

        System.out.println(car1.hashCode() == car2.hashCode());

        System.out.println(car3 == car1); // Retorna falso por == se referir a referência de memória
    }
}
