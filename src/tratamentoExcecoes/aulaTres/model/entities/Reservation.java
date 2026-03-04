package tratamentoExcecoes.aulaTres.model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        if (roomNumber == null || checkin == null || checkout == null) {
            throw new IllegalArgumentException("Error: Invalid data! (Cannot be null)");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public int duration() {
        long days = ChronoUnit.DAYS.between(checkin, checkout);
        return Math.toIntExact(Math.abs(days)); // Retorna a diferença de dias
    }

    

    // Continuar
        public void updateDates(LocalDate checkin, LocalDate checkout) {
        if (!checkin.isAfter(this.checkin)) {
            throw new IllegalArgumentException("O novo check-in deve ser posterior ao checkin inicial");
        }
        if (checkin.isBefore(this.checkout)) {
            throw new IllegalArgumentException("O novo check-in deve ser posterior ao checkout inicial");
        }
    }
}
