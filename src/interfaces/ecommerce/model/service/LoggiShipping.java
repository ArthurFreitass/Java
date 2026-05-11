package ecommerce.model.service;

public class LoggiShipping implements ShippingService {

    public LoggiShipping() {
    }

    @Override
    public double calculateShipping(double amount) {
        return amount * 0.1;
    }
}
