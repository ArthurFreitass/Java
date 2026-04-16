package interfaces.primeiraAula.model.entities;

import interfaces.primeiraAula.model.exception.DomainException;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentalCompany {

    private String modelCar;
    private LocalDateTime initialInstant;
    private LocalDateTime finalInstant;
    private Double valuePerHour;
    private Double diaryValue;

    public RentalCompany() {
    }

    public RentalCompany(String modelCar, LocalDateTime initialInstant, LocalDateTime finalInstant, Double valuePerHour, Double diaryValue) {
        if (modelCar.isEmpty()) {
            throw new DomainException("Error: Model car cannot be empty!");
        }
        if (initialInstant.isAfter(finalInstant)) {
            throw new DomainException("Error: Initial instant cannot be before of final instant!");
        }
        if (finalInstant.isBefore(initialInstant)) {
            throw new DomainException("Error: Final instant cannot be before of initial instant!");
        }
        if (valuePerHour <= 0) {
            throw new DomainException("Error: Value per hour cannot be less or equal than zero!");
        }
        if (diaryValue <= 0) {
            throw new DomainException("Error: Value per hour cannot be less or equal than zero!");
        }
        this.modelCar = modelCar;
        this.initialInstant = initialInstant;
        this.finalInstant = finalInstant;
        this.valuePerHour = valuePerHour;
        this.diaryValue = diaryValue;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        if (modelCar.isEmpty()) {
            throw new DomainException("Error: Model car cannot be empty!");
        }
        this.modelCar = modelCar;
    }

    public LocalDateTime getInitialInstant() {
        return initialInstant;
    }

    public void setInitialInstant(LocalDateTime initialInstant) {
        if (initialInstant.isBefore(finalInstant)) {
            throw new DomainException("Error: Initial instant cannot be before of final instant!");
        }
        this.initialInstant = initialInstant;
    }

    public LocalDateTime getFinalInstant() {
        return finalInstant;
    }

    public void setFinalInstant(LocalDateTime finalInstant) {
        if (finalInstant.isBefore(initialInstant)) {
            throw new DomainException("Error: Final instant cannot be before of initial instant!");
        }
        this.finalInstant = finalInstant;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        if (valuePerHour <= 0) {
            throw new DomainException("Error: Value per hour cannot be less or equal than zero!");
        }
        this.valuePerHour = valuePerHour;
    }

    public Double getDiaryValue() {
        return diaryValue;
    }

    public void setDiaryValue(Double diaryValue) {
        if (diaryValue <= 0) {
            throw new DomainException("Error: Diary value cannot be less or equal than zero!");
        }
        this.diaryValue = diaryValue;
    }

    // Arrumar a lógica para totalValue na diaryValue

    private double totalHours() {
        double minutes = Duration.between(initialInstant, finalInstant).toMinutes();
        return Math.ceil(minutes / 60.0);
    }

    private long totalDays() {
        return ChronoUnit.DAYS.between(initialInstant, finalInstant);
    }

    public double TAX(double amount) {
        if (amount > 100.00) {
            return 0.15 * amount;
        }
        return 0.2 * amount;
    }

    public double basicPay() {
        if (totalHours() > 12) {
            return diaryValue * totalDays() + valuePerHour * totalHours();
        }
        return valuePerHour * totalHours();
    }

    public double totalValue() {
        if (totalHours() > 12) {
            return diaryValue * totalDays() + (TAX(diaryValue));
        }
        return valuePerHour * totalHours() + TAX(valuePerHour * totalHours());
    }
}
