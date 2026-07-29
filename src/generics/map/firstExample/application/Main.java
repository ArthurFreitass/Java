package generics.map.firstExample.application;

import generics.map.firstExample.entities.Car;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car, Integer> carSales = new HashMap<>();

        Car c1 = new Car("Ferrari GT720", "HypeCar", 1000000.0);
        Car c2 = new Car("Mclaren P1", "HypeCar", 1300000.0);

        carSales.put(c1, 3);
        carSales.put(c2, 4);

        // Testando a igualdade

        Car testCar = new Car("Mclaren P1", "HypeCar", 1300000.0);
        System.out.println("Contains key 'testCar' in carSales "+ carSales.containsKey(testCar));

        // Se o hashCode equals() não for implementado retorna false
    }
}
