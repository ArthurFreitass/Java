package enumComp.exercicios.Dois.application;

import enumComp.exercicios.Dois.entities.Contract;
import enumComp.exercicios.Dois.entities.ContractService;
import enumComp.exercicios.Dois.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the contract details:");
        System.out.print("Numbers: ");
        int nums =  sc.nextInt();
        sc.nextLine();
        System.out.print("Date: ");
        String strDate = sc.next();
        sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(strDate, fmt);

        System.out.print("Total value $ in contract: ");
        double totalValue = sc.nextDouble();
        sc.nextLine();

        Contract contract = new Contract(nums, date, totalValue);

        System.out.println("Enter the installment data:");
        System.out.print("Enter the number of installments: ");
        int numInstallment = sc.nextInt();
        sc.nextLine();

        ContractService contractService = new ContractService();
        contractService.processContract(contract, numInstallment);

        for (Installment inst : contract.getInstallmentList()) {
            System.out.println(inst);
        }
    }
}
