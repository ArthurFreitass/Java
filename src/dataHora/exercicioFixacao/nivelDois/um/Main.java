package dataHora.exercicioFixacao.nivelDois.um;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma data: ");
        String firstDate = sc.next();

        System.out.print("\nEntre com uma segunda data: ");
        String secondDate = sc.next();

        LocalDate date1 = LocalDate.parse(firstDate);
        LocalDate date2 = LocalDate.parse(secondDate);

        Duration duration = Duration.between(date2.atStartOfDay(), date1.atStartOfDay());

        System.out.println(duration.toDays());

        sc.close();
    }
}
