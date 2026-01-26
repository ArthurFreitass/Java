package dataHora.exercicioFixacao.nivelDois.dois;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date: ");
        String strDate = sc.next();

        sc.close();

        // Instância um objeto data

        LocalDate date = LocalDate.parse(strDate);

        LocalDate dateNow = LocalDate.now();

        if (date.isBefore(dateNow)) {
            System.out.println("anterior");
        } else if (date.isAfter(dateNow)) {
            System.out.println("posterior");
        } else {
            System.out.println("é igual");
        }
    }
}
