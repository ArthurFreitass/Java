package exercicio.application;

import exercicio.entities.NaturalPerson;
import exercicio.entities.PersonLegal;
import exercicio.entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numTaxPayers = sc.nextInt();

        for (int i = 0; i < numTaxPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxpayersType = sc.nextLine().charAt(0);
            System.out.print();
        }
    }
}
