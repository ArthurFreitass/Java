package interfaces.segundaAula.primeiraRefatoracao.model.service;

import interfaces.segundaAula.primeiraRefatoracao.model.entities.CarRental;
import interfaces.segundaAula.primeiraRefatoracao.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private CarRental carRental;
    public RentalService(CarRental carRental) {
        this.carRental = carRental;
    }

    private double calculateHours() {
        double minutes = Duration.between(carRental.getInitialInstant(), carRental.getFinalInstant()).toMinutes();
        return Math.ceil(minutes / 60.0);
    }

    private double calculateDays() {
        double hours = Duration.between(carRental.getInitialInstant(), carRental.getFinalInstant()).toHours();
        return Math.ceil(hours / 24.0);
    }

    private double calculateTax() {
        double numHours = calculateHours();
        if (numHours > 12) {
            return 0.15;
        }
        return 0.20;
    }

    private double calculateBasicPayment(double priceHour, double priceDay) {
        double numHours = calculateHours();
        if (numHours > 12) {
            double numDays = calculateDays();
            return priceDay * numDays;
        }
        return priceHour * numHours;
    }

    public void processInvoice(double valueHour, double valueDay) {
        // Salva os valores na invoice
        double basicPay = calculateBasicPayment(valueHour, valueDay);
        Invoice invoice = new Invoice(basicPay, calculateTax());
    }
}
