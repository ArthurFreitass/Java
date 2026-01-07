package introducaoLogica.Repetition.For;

import java.util.Scanner;

public class Exercise5 {
    // Fatorial de N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); long fatorial = 1;

        if (n < 0) {
            System.out.println("Valor inválido");;
        }
        else {
            for (int index = 1; index <= n; index += 1) {
                fatorial *= index;
            }
            System.out.println("FATORIAL = "+fatorial);
        }
    }
}
