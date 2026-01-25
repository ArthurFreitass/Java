package dataHora.aulaDois;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date01 = LocalDate.parse("2025-04-30");
        LocalDateTime dateTime01 = LocalDateTime.parse("2025-04-30T01:40:22");
        Instant date02 = Instant.parse("2025-01-30T09:00:05-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("date after formatter = " + date01.format(fmt1));
        System.out.println("date after formatter = " + fmt1.format(date01));

        System.out.println("\n"+date02);
        System.out.println("datetime after formatter = " + fmt2.format(date02));

    }
}