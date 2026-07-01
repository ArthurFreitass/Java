package generics.fixacao.service;

import java.util.Collections;
import java.util.List;

public class CalculationService {

    public static <T extends Comparable< ? super T>> List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
