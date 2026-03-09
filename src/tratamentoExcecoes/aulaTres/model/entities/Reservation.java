package tratamentoExcecoes.aulaTres.application.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        if (roomNumber == null || checkin == null || checkout == null) {
            throw new IllegalArgumentException("Error: The data cannot be null.");
        }
        this.roomNumber = roomNumber;

        // Deve ocorrer uma checagem aqui dentro também

        if (checkin.isAfter(checkout)) {
            throw new IllegalArgumentException("Error: Check-out must be after check-in.");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Deve retornar o número de dias como um int
    public int duration() {
        long days = ChronoUnit.DAYS.between(checkin, checkout);
        return Math.toIntExact(days);
    }

    public void updateDate(LocalDate checkin, LocalDate checkout) {
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Error in reservation: the new reservation dates for update must be later than the old ones");
        }

        if (checkin.isAfter(checkout) || checkin.isEqual(checkout)) {
            throw new IllegalArgumentException("Error: Check-out must be after check-in");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String toString() {
        return "Reservation: Room " + roomNumber + ", check-in: " + FMT.format(checkin) + ", check-out: " + FMT.format(checkout) + ", "+ duration() + " nights";
    }
}
