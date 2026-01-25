package dataHora.exercicioFixacao.um;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma data no padrão ISO 8601:");
        String dt = sc.next();

        LocalDate date = LocalDate.parse(dt);

        System.out.println("\nData: " + date);
        sc.close();
    }
}
