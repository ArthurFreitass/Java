package comportamentoMemoria.arrays.exerciciosFixacao.exercicioDois.application;

import comportamentoMemoria.arrays.exerciciosFixacao.exercicioDois.entities.Numbers;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int response = sc.nextInt();

        if (response > 0) {
            double sum = 0;
            Numbers[] n = new Numbers[response]; // Criando referência na heap

            for (int index = 0; index < n.length; index += 1) {
                System.out.print("Digite um número: ");
                double num = sc.nextDouble();

                n[index] = new Numbers(num);
                sum += num;
            }

            System.out.print("\nVALORES");

            for (int i = 0; i < n.length; i += 1) {
                System.out.print("  " + n[i].getNum());
            }

            double avg = sum / n.length;

            System.out.printf("\nSOMA = %.2f%n", sum);
            System.out.printf("MÉDIA = %.2f%n", avg);

        }

        sc.close();
    }
}
