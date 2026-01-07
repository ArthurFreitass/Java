package introducaoLogica.Repetition.For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        * Receber N
        * Ler N números
        * Divisão dos números*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int index = 0; index < n; index += 1) {
            double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
            if (num2 == 0) {
                System.out.println("Divisão impossível");
                break;
            }
            System.out.printf("%.1f%n", num1 / num2);
        }
        sc.close();
    }
}
