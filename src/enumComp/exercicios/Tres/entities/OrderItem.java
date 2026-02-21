package enumComp.exercicios.Tres.entities;

public class OrderItem {

    private int quantity;
    private Product product;

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double calculateSubtotal() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product + " | Quantidade: " + quantity + " | Subtotal: $ " + calculateSubtotal()+"\n";
    }
}
