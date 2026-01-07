package introducaoLogica.formatNumber;

import java.util.Locale;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário atual: ");
        salary = sc.nextDouble();
        // Formatando

        System.out.printf("%.2f%n", salary);
        System.out.printf("Salário: %.2f R$%n", salary);
    }
}
