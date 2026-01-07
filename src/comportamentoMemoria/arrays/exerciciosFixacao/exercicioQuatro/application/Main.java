package comportamentoMemoria.arrays.exerciciosFixacao.exercicioQuatro.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int response = sc.nextInt();

        if (response > 0) {

            int [] numbers = new int[response];
            String messageOut = "";

            for (int index = 0; index < numbers.length; index += 1) {
                System.out.print("Digite um número: ");
                numbers[index] = sc.nextInt();

                if (numbers[index] % 2 == 0) {
                    messageOut += "" + numbers[index] + "  ";
                }
            }
            System.out.println("\nNÚMEROS PARES");
            System.out.println(messageOut);
        }
    }
}
