package ecommerce.model.service;

import ecommerce.model.entities.Order;

public class OrderProcessor {

    // Recebe duas interfaces

    private ShippingService shippingService;
    private DiscountService discountService;

    public OrderProcessor(ShippingService shippingService, DiscountService discountService) {
        this.discountService = discountService;
        this.shippingService = shippingService;
    }

    public void processOrder(Order order) {

        // Terá de retorna os valores pois ainda não sei usar um OrderSummary

        double value = order.getBaseValue();
        double shipping = shippingService.calculateShipping(value);

        double valueWithShipping = value + shipping;

        double discount = discountService.applyDiscount(valueWithShipping);

        order.setBaseValue(valueWithShipping - discount);
    }
}
