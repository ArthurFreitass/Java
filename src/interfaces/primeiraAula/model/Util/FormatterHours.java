package interfaces.primeiraAula.model.Util;

import interfaces.primeiraAula.model.exceptions.DomainException;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterHours {

    public static LocalDateTime formatter (String timeStr) {
       try {
           DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
           return LocalDateTime.parse(timeStr, fmt);
       } catch (DateTimeException e) {
           throw new DomainException("Error: Invalid date try again");
       }
    }
}
