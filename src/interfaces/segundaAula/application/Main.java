package interfaces.segundaAula.primeiraRefatoracao.application;

import interfaces.primeiraAula.model.Util.FormatterHours;
import interfaces.segundaAula.primeiraRefatoracao.Util.Formatter;
import interfaces.segundaAula.primeiraRefatoracao.model.entities.CarRental;
import interfaces.segundaAula.primeiraRefatoracao.model.entities.Vehicle;
import interfaces.segundaAula.primeiraRefatoracao.model.exceptions.DomainException;
import interfaces.segundaAula.primeiraRefatoracao.service.RentalService;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nARTHUR-LOCALIZA");
            System.out.println("================\n");

            Locale.setDefault(Locale.US);

            System.out.println("Entre com os dados do aluguel");
            System.out.print("Modelo do carro: ");
            String carModel = sc.nextLine();

            System.out.print("\nRetirada (dd/MM/yyyy HH:mm): ");
            LocalDateTime pickup = LocalDateTime.parse(sc.nextLine(), Formatter.fmt);

            System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
            LocalDateTime deliveryCar = LocalDateTime.parse(sc.nextLine(), Formatter.fmt);

            CarRental carRental = new CarRental(pickup, deliveryCar, new Vehicle(carModel));

            // Fatura

            System.out.println("\nFatura:");
            System.out.print("Entre com o preço por hora: ");
            double priceHour = sc.nextDouble(); sc.nextLine();

            System.out.print("Entre com o preço por dia: ");
            double priceDay = sc.nextDouble(); sc.nextLine();

            RentalService rentalService = new RentalService(carRental); // Instância Invoice
            rentalService.processInvoice(priceHour, priceDay);

            System.out.println(carRental.getInvoice());

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error!");
            e.printStackTrace();
        }
    }
}
