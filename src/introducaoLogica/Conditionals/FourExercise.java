package introducaoLogica.Conditionals;

import java.util.Scanner;

public class FourExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = 100;
        int conta = 50;

        int minutosUsados = sc.nextInt();

        sc.close();

        if (minutosUsados <= 100) {
            System.out.println("Valor a ser pago = R$ "+conta);
        } else {
            int excedente = minutosUsados - minutos;
            conta += excedente * 2;
            System.out.println("Valor a ser pago = R$ "+conta);
        }
    }
}
