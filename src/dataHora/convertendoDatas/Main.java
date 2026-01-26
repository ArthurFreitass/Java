package dataHora.convertendoDatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2000-01-01");

        // Pegando todos os fuso-horários

        /*for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        // pega todos os fuso-horários conhecidos timezones  ZoneId.getAvailableZoneIds()

        // Exemplo

        Instant psDate = Instant.now();
        LocalDateTime mainDate = LocalDateTime.ofInstant(psDate, ZoneId.systemDefault());

        System.out.println("psDate = "+psDate);
        System.out.println("mainDate = "+mainDate);

        // Pegando dia, mês e ano

        LocalDate date3 = LocalDate.parse("2018-04-23");

        System.out.println("\nYear = "+date3.getYear() + "\nDay = "+ date3.getDayOfMonth() + "\nMouth = " + date3.getMonth());
    }
}
