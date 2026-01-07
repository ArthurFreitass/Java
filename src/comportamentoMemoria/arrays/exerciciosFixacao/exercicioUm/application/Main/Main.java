package comportamentoMemoria.arrays.exerciciosFixacao.exercicioUm.application.Main;

import comportamentoMemoria.arrays.exerciciosFixacao.exercicioUm.entities.Numbers;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? [MÁX = 10]: ");
        int response = sc.nextInt();

        if (response > 0 && response <= 10) {

            Numbers[] n = new Numbers[response];

            for (int index = 0; index < n.length; index += 1) {
                System.out.print("Digite um número: ");
                int num = sc.nextInt();

                n[index] = new Numbers(num); // Criando o objeto na referência
            }

            System.out.println("NÚMEROS NEGATIVOS:");

            for (int index = 0; index < n.length; index += 1) {
                if (n[index].getNum() < 0) {
                    System.out.println(n[index].getNum());
                }
            }
        } else {
            System.out.println("ERRO: Valor inválido!");
        }
        sc.close();
    }
}
