package dataHora.exercicioFixacao.tres;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mostrar dados sobre a data atual

        LocalDate date = LocalDate.now();

        System.out.println("Day = "+ date.getDayOfMonth());
        System.out.println("Mouth = "+ date.getMonth());
        System.out.println("Year = "+ date.getYear());
    }
}