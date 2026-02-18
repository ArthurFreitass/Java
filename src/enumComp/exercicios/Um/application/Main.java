package enumComp.exercicios.Um.application;

import enumComp.exercicios.Um.entities.Client;
import enumComp.exercicios.Um.entities.Order;
import enumComp.exercicios.Um.entities.OrderItem;
import enumComp.exercicios.Um.entities.Product;
import enumComp.exercicios.Um.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String strDate = sc.next();
        sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birthDate = LocalDate.parse(strDate, fmt);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String strStatus = sc.next();
        sc.nextLine();

        OrderStatus status = OrderStatus.valueOf(strStatus);


        System.out.print("How many item to this order? ");
        int numOrder = sc.nextInt();
        sc.nextLine();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 0; i < numOrder; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            sc.nextLine();

            // Já instância

            Product p = new Product(nameProduct, priceProduct);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, priceProduct, p);

            order.addItem(orderItem);
        }
        System.out.println("\n"+order);
        sc.close();
    }
}
