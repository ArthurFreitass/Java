package enumComp.exercicios.Tres.application;

import enumComp.exercicios.Tres.entities.Order;
import enumComp.exercicios.Tres.entities.OrderItem;
import enumComp.exercicios.Tres.entities.Product;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Product p1 = new Product("Teclado", 100.0);
        Product p2 = new Product("Mouse", 50.0);
        Product p3 = new Product("Monitor", 900.0);

        OrderItem orderItem1 = new OrderItem(2, p1);
        OrderItem orderItem2 = new OrderItem(1, p2);
        OrderItem orderItem3 = new OrderItem(1, p3);

        Order order = new Order(1);
        order.addItems(orderItem1);
        order.addItems(orderItem2);
        order.addItems(orderItem3);

        System.out.println("\n#Pedido 1:");
        System.out.println(order + "\nTotal: "+ order.totalValue());
    }
}
