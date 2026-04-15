package interfaces.segundaAula.primeiraRefatoracao.model.entities;

import interfaces.segundaAula.primeiraRefatoracao.model.exceptions.DomainException;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime initialInstant;
    private LocalDateTime finalInstant;
    private Vehicle vehicle; // Recebe o veículo
    private Invoice invoice;

    public CarRental(LocalDateTime initialInstant, LocalDateTime finalInstant, Vehicle vehicle) {
        validateDates(initialInstant, finalInstant);
        this.initialInstant = initialInstant;
        this.finalInstant = finalInstant;
        this.vehicle = vehicle;
    }

    public void validateDates(LocalDateTime start, LocalDateTime end) {
        if (start.isAfter(end)) {
            throw new DomainException("Error: Initial date cannot be after of final date!");
        }
    }

    public LocalDateTime getInitialInstant() {
        return initialInstant;
    }

    public void setInitialInstant(LocalDateTime initialInstant) {
        validateDates(initialInstant, this.finalInstant);
        this.initialInstant = initialInstant;
    }

    public LocalDateTime getFinalInstant() {
        return finalInstant;
    }

    public void setFinalInstant(LocalDateTime finalInstant) {
        validateDates(this.initialInstant, finalInstant);
        this.finalInstant = finalInstant;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
