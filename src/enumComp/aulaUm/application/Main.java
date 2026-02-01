package enumComp.aulaUm.application;

import enumComp.aulaUm.entities.Order;
import enumComp.aulaUm.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Convertendo String para Enum

        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();

        OrderStatus orderStatus = OrderStatus.valueOf(status);

        Order order = new Order(123, LocalDate.now(), orderStatus);
        System.out.println(order);

        sc.close();
    }
}
