package interfaces.primeiraAula.model.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterHours {

    public static LocalDateTime formatter (String timeStr) {
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       return LocalDateTime.parse(timeStr, fmt);
    }
}
