package enumComp.exercicios.Dois.application;

import enumComp.exercicios.Dois.entities.Contract;
import enumComp.exercicios.Dois.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int nums = sc.nextInt();
        sc.nextLine();

        System.out.print("Date (dd/MM/yyyy): ");
        String strDate = sc.next();
        sc.nextLine();

        LocalDate date = LocalDate.parse(strDate, fmt);

        System.out.print("Contract value:");
        double contractValue = sc.nextDouble();

        // Instância Installment

        Contract contract = new Contract(nums, date, contractValue);

        System.out.print("Enter the number of installments: ");
        int numInstallments = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numInstallments; i++) {
            // Aqui dentro cada parcela recebe valor?

            contract.addInstallment(date, );
        }
    }
}
