package interfaces.documentacao.primeiraAula.application;

import interfaces.documentacao.primeiraAula.model.Util.FormatterHours;
import interfaces.documentacao.primeiraAula.model.entities.RentalCompany;
import interfaces.documentacao.primeiraAula.model.exceptions.DomainException;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a rental data:");

            System.out.print("Car model data: ");
            String modelCar = sc.nextLine();

            System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
            String initialInstant = sc.nextLine();

            System.out.print("Return (dd/MM/yyyy hh:mm): ");
            String finalInstant = sc.nextLine();

            LocalDateTime pickup = FormatterHours.formatter(initialInstant);
            LocalDateTime timeReturn = FormatterHours.formatter(finalInstant);

            System.out.print("Enter a price per hour: ");
            double priceHour = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a price per day: ");
            double priceDay = sc.nextDouble();
            sc.nextLine();

            RentalCompany rentalCompany = new RentalCompany(modelCar, pickup, timeReturn, priceHour, priceDay);

            System.out.println("\nINVOICE:");
            System.out.println("Basic payment: " + String.format("%.2f", rentalCompany.basicPay()));
            System.out.println("TAX "+ String.format("%.2f", rentalCompany.TAX(rentalCompany.basicPay())));
            System.out.println("Total payment: "+ String.format("%.2f", rentalCompany.totalValue()));
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }
}
