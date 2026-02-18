package enumComp.exercicios.Um.entities;

public class OrderItem {

    private int quantity;
    private double price;
    private Product product; // Associação com o produto

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public double subtotal() {
        return quantity * price;
    }
}
