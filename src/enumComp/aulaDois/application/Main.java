package enumComp.aulaDois.application;

import enumComp.aulaDois.application.entities.Departament;
import enumComp.aulaDois.application.entities.HourContract;
import enumComp.aulaDois.application.entities.Worker;
import enumComp.aulaDois.application.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter departament's name: ");
        String dp = sc.nextLine();

        Departament departament = new Departament(dp);

        System.out.println("\nEnter the worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String lvl = sc.nextLine();
        WorkerLevel level = WorkerLevel.valueOf(lvl);

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, level, baseSalary, departament);

        System.out.print("How many contract's to this worker?");
        int numContract = sc.nextInt();


        for (int i = 0; i < numContract; i++) {
            System.out.println("Enter contract #" + (i + 1) +" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String brDate = sc.next();
            sc.nextLine();
            LocalDate date = LocalDate.parse(brDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double hourValue = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duration: ");
            int hours = sc.nextInt();
            sc.nextLine();

        }
    }
}
