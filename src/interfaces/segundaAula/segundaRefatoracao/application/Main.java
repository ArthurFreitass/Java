package interfaces.segundaAula.segundaRefatoracao.application;

import interfaces.segundaAula.segundaRefatoracao.entities.CarRental;
import interfaces.segundaAula.segundaRefatoracao.entities.Vehicle;
import interfaces.segundaAula.segundaRefatoracao.exceptions.DomainException;
import interfaces.segundaAula.segundaRefatoracao.service.BrasilTaxService;
import interfaces.segundaAula.segundaRefatoracao.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main() {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nARTHUR-LOCALIZA");
            System.out.println("================\n");


            System.out.println("Entre com os dados do aluguel");
            System.out.print("Modelo do carro: ");
            String carModel = sc.nextLine();

            System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
            LocalDateTime pickup = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

            System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
            LocalDateTime deliveryCar = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

            CarRental carRental = new CarRental(pickup, deliveryCar, new Vehicle(carModel));

            System.out.print("Entre com o preço por hora: ");
            double priceHour = sc.nextDouble(); sc.nextLine();

            System.out.print("Entre com o preço por dia: ");
            double priceDay = sc.nextDouble(); sc.nextLine();

            BrasilTaxService brasilTax = new BrasilTaxService();

            RentalService rentalService = new RentalService(priceHour, priceDay, brasilTax); // Instância
            rentalService.processInvoice(carRental);

            System.out.println("FATURA:");
            System.out.print(carRental.getInvoice());

        } catch (DomainException e) {
            System.out.println("\n"+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("\n"+e.getMessage());
        } catch (Exception e) {
            System.out.println("\nUnexpected error!");
            e.printStackTrace();
        }
    }
}
