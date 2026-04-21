package interfaces.terceiraAula.terceiraRefatoracao.model.service;

import interfaces.terceiraAula.terceiraRefatoracao.model.entities.CarRental;
import interfaces.terceiraAula.terceiraRefatoracao.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double priceHour;
    private Double priceDay;

    private TaxService brasilTax; // Quem opera a classe é a própria interface/classe

    public RentalService(Double priceHour, Double priceDay, TaxService brasilTax) {
        this.priceHour = priceHour;
        this.priceDay = priceDay;
        this.brasilTax = brasilTax;
    }

    public TaxService getBrasilTax() {
        return brasilTax;
    }

    public Double getPriceDay() {
        return priceDay;
    }

    public Double getPriceHour() {
        return priceHour;
    }

    // setters não fazem sentido em uma service

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getInitialInstant(), carRental.getFinalInstant()).toMinutes();
        double hours = Math.ceil(minutes / 60.0);

        double basicPayment = basicPay(hours);
        double tax = brasilTax.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    private double basicPay(double hours) {
        if (hours > 12.0) {
            return priceHour * hours;
        }
        double days = Math.ceil(hours / 24.0);

        return priceDay * days;
    }
}
