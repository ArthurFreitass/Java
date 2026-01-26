package dataHora.instanciandoDatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Locais
        LocalDate dt01 = LocalDate.now();
        LocalDateTime time01 = LocalDateTime.now();

        System.out.println("SAÍDAS");

        System.out.println("Data local: " + dt01);
        System.out.println("Hórario local: " + time01);

        // Mundiais

        Instant dt02 = Instant.now();

        System.out.println("\nSAÍDAS MUNDIAIS:");

        System.out.println(dt02);

        // Criando uma data customizada (Deve obedecer o padrão ISO 8601)

        // Data local

        LocalDate dt03 = LocalDate.parse("1999-06-21");
        LocalDateTime time02 = LocalDateTime.parse("1999-06-21T12:04:21");

        // Data mundial

        Instant dt04 = Instant.parse("1999-06-21T01:04:21Z");
        Instant time03 = Instant.parse("2021-04-09T01:00:20-03:00");

        System.out.println("\nDatas customizadas:");

        System.out.println(dt03);
        System.out.println(time02);
        System.out.println(dt04);
        System.out.println(time03);

        // Convertendo uma data

        System.out.println("\nConvertendo tipos diferentes de data-hora:");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate brDate = LocalDate.parse("23/01/2026", fmt1);
        LocalDateTime brDateTime = LocalDateTime.parse("23/01/2026 05:33:25", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(brDate);
        System.out.println(brDateTime);

       // Dados isolados

       LocalDate dt05 = LocalDate.of(2026, 01, 23);
       LocalDateTime dt06 = LocalDateTime.of(2026, 01, 23, 15, 58, 15);

        System.out.println("\nDADOS ISOLADOS");
        System.out.println(dt05);
        System.out.println(dt06);
    }

}