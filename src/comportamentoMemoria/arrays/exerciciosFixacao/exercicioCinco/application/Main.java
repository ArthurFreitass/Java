package comportamentoMemoria.arrays.exerciciosFixacao.exercicioCinco.application;

import comportamentoMemoria.arrays.exerciciosFixacao.exercicioCinco.entities.HighestPosition;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int numbers = sc.nextInt();

        if (numbers > 0) {
            HighestPosition[] num = new HighestPosition[numbers];

            for (int index = 0; index < num.length; index += 1) {

                System.out.print("Digite um número: ");
                double number = sc.nextDouble();
                num[index] = new HighestPosition(number);
            }

            double highestPosition = num[0].getNum();
            int position = 0;

            for (int i=1;i<num.length;i++) {
                if (num[i].getNum() > highestPosition) {
                    highestPosition = num[i].getNum();
                    position = i;
                }
            }
            System.out.println("Maior valor = " + highestPosition);
            System.out.println("POSIÇÃO = "+ position);
        }
    }
}
