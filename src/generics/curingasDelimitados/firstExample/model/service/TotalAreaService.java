package generics.curingasDelimitados.firstExample.model.service;

import java.util.List;

public class TotalAreaService {

    // A implementação com List<Shape> e List<?> São incorretas

    // Esse tipo List<Shape> não aceita eu adicionar nenhu subtipo de Shape

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape item : list) {
            sum += item.area();
        }
        return sum;
    }
}
