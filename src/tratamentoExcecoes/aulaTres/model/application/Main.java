package tratamentoExcecoes.aulaTres.application;

import tratamentoExcecoes.aulaTres.application.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (DD/MM/YYYY): ");
            LocalDate checkin = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            LocalDate checkout = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("\n"+reservation);

            // Update
            System.out.println("Update dates:");

            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            reservation.updateDate(checkin, checkout);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
