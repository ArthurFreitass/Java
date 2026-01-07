package introducaoLogica.OperatorsExercise;

import java.util.Locale;
import java.util.Scanner;

public class ThreeExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A;
        double B;
        double C;
        double D;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para [A]");
        System.out.println("Digite um número para [B]");
        System.out.println("Digite um número para [C]");
        System.out.println("Digite um número para [D]");

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        sc.close();

        double sumAB = A + B;
        double sumCD = C + D;
        double subtraction = sumAB - sumCD;

        System.out.printf("DIFERENÇA AB - CD = %.0f%n", subtraction);
    }
}
