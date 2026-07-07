package generics.secondExample.service;

import generics.secondExample.entities.Product;

import java.util.List;

public class CalculationServiceNoComparable {

    public CalculationServiceNoComparable() {
    }

    public Product max(List<Product> list) {
        Product biggest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() > biggest.getPrice()) {
                biggest = list.get(i);
            }
        }

        return biggest;
    }
}
