package dataHora.calculando;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Calculando dados entre datas diferentes

        LocalDate date1 = LocalDate.parse("2026-01-26");
        LocalDate pastWeek = date1.minusDays(7); // Minus diminui e plus adiciona dias

        LocalDate nextWeek = date1.plusDays(7);

        System.out.println(nextWeek);

        // LocalDateTime

        LocalDateTime dateTime = LocalDateTime.now();

        LocalDateTime dateTime2 = dateTime.minusYears(3).minusWeeks(2).minusMinutes(40);

        System.out.println(dateTime2);

       // Instant

        Instant dateNow = Instant.now();
        Instant pastTwoWeek = dateNow.minus(14, ChronoUnit.DAYS);

        System.out.println(pastTwoWeek);

        // Calculando a diferença de duração entre duas data-horas

        Duration t1 = Duration.between(pastTwoWeek, dateNow);

    System.out.println("Duration = "+ t1.toDays());

    // atTime(0,0) ou atStartofDay para LocaleDate
    }
}
