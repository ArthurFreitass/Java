package metodosAbstratos.application;

import metodosAbstratos.entities.Circle;
import metodosAbstratos.entities.Rectangle;
import metodosAbstratos.entities.Shape;
import metodosAbstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = sc.nextInt();
        sc.nextLine();

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < numShapes; i++) {
            System.out.print("Rectangle or Circle (c/r) ? ");
            char shapeType = sc.nextLine().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            sc.nextLine();

            if (shapeType == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();

                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
