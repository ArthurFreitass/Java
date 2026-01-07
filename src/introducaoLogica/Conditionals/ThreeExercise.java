package introducaoLogica.Conditionals;

import java.util.Locale;
import java.util.Scanner;

public class ThreeExercise {
    public static void main(String[] args) {
        // Descobrir em qual quadrante os pontos (x,y pertencem)

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para (x)");
        double x = sc.nextDouble();

        System.out.println("Digite um valor para (y)");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else
            System.out.println("Q4");
    }
}
