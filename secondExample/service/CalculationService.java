package generics.secondExample.service;

import java.util.List;

public class CalculationService {

    public CalculationService() {
    }

    public <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Error: List is null!");
        }

        T max = list.get(0); // Pega o primeiro objeto da lista

        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element; // Max recebe o maior
            }
        }
        return max;
        // Collections.max(list) - executa isso
    }
}
