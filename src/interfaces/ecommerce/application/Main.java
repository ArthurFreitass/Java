package ecommerce.application;

import ecommerce.model.service.LoggiShipping;
import ecommerce.model.service.NoDiscount;
import ecommerce.model.entities.Order;
import ecommerce.model.service.OrderProcessor;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import static ecommerce.model.util.DateUtil.fmt;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("ENTER A ORDER DATA:");
            System.out.print("Number: ");
            int num = sc.nextInt(); sc.nextLine();

            System.out.print("Date: ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

            System.out.print("Base value: ");
            double value = sc.nextDouble(); sc.nextLine();

            System.out.print("Customer name: ");
            String customer = sc.nextLine();

            Order order = new Order(num, date, value, customer);

            OrderProcessor processor = new OrderProcessor((new LoggiShipping()),  new NoDiscount());
            // Basta escolher qual classe vai implementar interface

            processor.processOrder(order);
        }
    }
}
