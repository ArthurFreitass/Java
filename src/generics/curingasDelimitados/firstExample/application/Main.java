package generics.curingasDelimitados.firstExample.application;

import generics.curingasDelimitados.firstExample.model.entities.Circle;
import generics.curingasDelimitados.firstExample.model.entities.Rectangle;
import generics.curingasDelimitados.firstExample.model.service.Shape;
import generics.curingasDelimitados.firstExample.model.service.TotalAreaService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Shape> list = new ArrayList<>();

            list.add(new Rectangle(1.0, 2.0));
            list.add(new Rectangle(1.0, 2.0));
            list.add(new Circle(4.0));

            List<Rectangle> rectangles = new ArrayList<>();
            rectangles.add(new Rectangle(1.0, 2.1));
            rectangles.add(new Rectangle(2.0, 2.5));

            System.out.println("Total Area = "+ String.format("%.2f", TotalAreaService.totalArea(rectangles)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
