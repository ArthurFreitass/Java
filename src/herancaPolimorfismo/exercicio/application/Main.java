package herancaPolimorfismo.exercicio.application;

import herancaPolimorfismo.exercicio.entities.NaturalPerson;
import herancaPolimorfismo.exercicio.entities.PersonLegal;
import herancaPolimorfismo.exercicio.entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numTaxpayers = sc.nextInt();
        sc.nextLine();

        List<Taxpayers> taxpayersList = new ArrayList<>();

        for (int i = 0; i < numTaxpayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");

            System.out.print("Individual or company? (i/c) ? ");
            char taxpayerType = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double incomeAnnual = sc.nextDouble();

            if (taxpayerType == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                taxpayersList.add(new NaturalPerson(name, incomeAnnual, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numEmployees = sc.nextInt();
                sc.nextLine();

                taxpayersList.add(new PersonLegal(name, incomeAnnual, numEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        double totalTaxes = 0;
        for (Taxpayers taxpayers : taxpayersList) {
            System.out.print(taxpayers);
            totalTaxes += taxpayers.tax();
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
    }
}
