package introducaoLogica.OperatorsExercise;

import java.util.Locale;
import java.util.Scanner;

public class FiveExercise {
    public static void main(String[] args) {
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
        // A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B

        Locale.setDefault(Locale.US);

        double value1;
        double value2;
        double value3;

        Scanner sc = new Scanner(System.in);

        value1 = sc.nextDouble();
        value2 = sc.nextDouble();
        value3 = sc.nextDouble();

        sc.close();

        double areaTriangle = (value1 * value3) / 2;
        float pi = 3.14159F;
        double areaCircle = pi * Math.pow(value2, 2.0);
        double areaTrapeze = ((value1 + value2) * value3) / 2;
        double areaSquare = Math.pow(value2, 2.0);
        double areaRectangle = value1 * value2;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapeze);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);
    }
}
