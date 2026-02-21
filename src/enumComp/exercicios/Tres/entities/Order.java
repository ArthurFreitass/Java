package enumComp.exercicios.Tres.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int number;

    // Associação de composição
    private List<OrderItem> orderItemList;

    public Order(int number) {
        this.number = number;
        this.orderItemList = new ArrayList<>(); // Inicia a lista em zero
    }

    public int getNumber() {
        return number;
    }

    public void addItems(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    public double totalValue() {
        double sum = 0;
        for (OrderItem orderItem : orderItemList) {
            sum += orderItem.calculateSubtotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : orderItemList) {
            sb.append(item);
        }
        return sb.toString();
    }
}
