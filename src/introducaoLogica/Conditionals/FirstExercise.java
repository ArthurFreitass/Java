package introducaoLogica.Conditionals;

import java.util.Scanner;
import java.util.Locale;

// Entrar com dois números e verificar se são múltiplos

public class FirstExercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número:");
        int num2 = sc.nextInt();

        if (num2 % num1 == 0 || num1 % num2 == 0) {
            System.out.print("Números são múltiplos entre si");
        } else {
            System.out.println("Não são múltiplos entre si");
        }
    }
}
