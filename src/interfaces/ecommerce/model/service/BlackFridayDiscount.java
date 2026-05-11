package ecommerce.model.service;

public class BlackFridayDiscount implements DiscountService {
    public BlackFridayDiscount() {
    }

    @Override
    public double applyDiscount(double amount) {
        return Math.abs(amount * 0.15);
    }
}
