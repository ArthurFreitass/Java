package ecommerce.model.service;

public class NoDiscount implements DiscountService {
    public NoDiscount() {
    }

    @Override
    public double applyDiscount(double amount) {
        return 0;
    }
}
