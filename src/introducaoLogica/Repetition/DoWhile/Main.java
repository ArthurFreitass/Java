package introducaoLogica.Repetition.DoWhile;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         char continueTemp = 's';
        Scanner sc = new Scanner(System.in);

        do {
            double tempC = sc.nextDouble();
            double tempF = (tempC * 9 / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);
            continueTemp = sc.next().charAt(0);
        } while (continueTemp == 's');
        sc.close();
    }
}
