package introducaoLogica.Conditionals;

import java.util.Scanner;

public class SecondExercise {
    // Calcular a duração de um jogo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int initialHour = sc.nextInt();

        System.out.print("Digite a hora de termino: ");
        int finalHour = sc.nextInt();

        int result = Math.abs(finalHour - initialHour);

        if (result == 0) {
            System.out.println("O jogo durou 24 horas");
        } else
            System.out.println("O jogo durou "+ result+ " horas");

    }
}
