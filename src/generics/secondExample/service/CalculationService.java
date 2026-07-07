package generics.secondExample.service;

import java.util.Collections;
import java.util.List;

public class CalculationService<T> {

    public CalculationService() {
    }

    public <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("Error: List cannot be null!");
        }
        return Collections.max(list);
    }
}
