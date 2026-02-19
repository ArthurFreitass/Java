package enumComp.exercicios.Um.entities;

import enumComp.exercicios.Um.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static DateTimeFormatter fmtMoment = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Associações

    private Client client;
    private List<OrderItem> itemList = new ArrayList<>(); // Mais de um pedido = lista

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem orderItem) {
        itemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        itemList.remove(orderItem);
    }

    public double total() {
        double sum = 0;
        for (OrderItem items : itemList) {
            sum += items.subtotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY\n");
        sb.append("ORDER MOMENT: "+ fmtMoment.format(moment));
        sb.append("\nORDER STATUS: "+ status);
        sb.append("\nClient: "+ client.getName() + " " + "("+ fmt.format(client.getBirthDate()) + ") - " + client.getEmail());
        sb.append("\nOrder items:\n");
        for (OrderItem orderItem : itemList) {
            sb.append(orderItem.getProduct().getName() + ", $" + String.format("%.2f", orderItem.getPrice()) + ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $"+ String.format("%.2f", orderItem.subtotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
