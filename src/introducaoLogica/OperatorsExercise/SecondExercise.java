package introducaoLogica.OperatorsExercise;

import java.util.Locale;
import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo,
         e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de um raio para um círculo: ");
        double radiusCircle = sc.nextDouble();
        sc.close();

        float piValue = 3.1459F;
        double area = piValue * Math.pow(radiusCircle, 2.0);

        System.out.printf("A = %.4f%n", area);
    }
}
