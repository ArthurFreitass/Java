package interfaces.segundaAula.primeiraRefatoracao.model.service;

import interfaces.segundaAula.primeiraRefatoracao.model.entities.CarRental;
import interfaces.segundaAula.primeiraRefatoracao.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    public RentalService() {
    }

    private double calculateHours(CarRental carRental) {
        double minutes = Duration.between(carRental.getInitialInstant(), carRental.getFinalInstant()).toMinutes();
        return Math.ceil(minutes / 60.0);
    }

    private double calculateDays(CarRental carRental) {
        double hours = Duration.between(carRental.getInitialInstant(), carRental.getFinalInstant()).toHours();
        return Math.ceil(hours / 24.0);
    }

    private double calculateTax(CarRental carRental) {
        double numHours = calculateHours(carRental);
        if (numHours > 12) {
            return 0.15;
        }
        return 0.20;
    }

    private double calculateBasicPayment(CarRental carRental, double priceHour, double priceDay) {
        double numHours = calculateHours(carRental);
        if (numHours > 12) {
            double numDays = calculateDays(carRental);
            return priceDay * numDays;
        }
        return priceHour * numHours;
    }

    public void processInvoice(CarRental carRental, double valueHour, double valueDay) {
        // Salva os valores na invoice
        double basicPay = calculateBasicPayment(carRental, valueHour, valueDay);
        Invoice invoice = new Invoice(basicPay, calculateTax(carRental));
        carRental.setInvoice(invoice);
    }
}
