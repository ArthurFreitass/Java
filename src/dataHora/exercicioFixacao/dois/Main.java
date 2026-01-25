package dataHora.exercicioFixacao.dois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma data no padrão BR:");
        String dtBr = sc.next();

        LocalDate date = LocalDate.parse(dtBr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("\nData no padrão ISO 8601: " + date);
    }
}
