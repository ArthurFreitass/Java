package interfaces.ecommerce.model.service;

public class FreeShipping implements ShippingService {
    public FreeShipping() {
    }

    @Override
    public double calculateShipping(double amount) {
        return 0;
    }
}
