package enumComp.compUm.application;

import enumComp.compUm.entities.Departament;
import enumComp.compUm.entities.HourContract;
import enumComp.compUm.entities.Worker;
import enumComp.compUm.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter departament's name: ");
        String departament = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String lvl = sc.nextLine();

        WorkerLevel level = WorkerLevel.valueOf(lvl);

        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, level, salary, new Departament(departament)); // Instância objeto

        System.out.print("How many contracts to this worker? ");
        int numContracts = sc.nextInt();
        sc.nextLine();

        for (int index = 0; index < numContracts; index++) {
            System.out.println("Enter contract #" + (index + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String StrDate = sc.next();
            sc.nextLine();

            DateTimeFormatter fmtBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(StrDate, fmtBR);

            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();
            sc.nextLine();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valueHour, hours); // Instância objeto
            worker.addContract(contract); // Salva cada um dos contratos
        }

        System.out.print("\nEnter year and month to calculate income (MM/YYYY): ");
        String StrcontractDate = sc.next();
        sc.nextLine();

        YearMonth yearMonth = YearMonth.parse(StrcontractDate, DateTimeFormatter.ofPattern("MM/yyyy"));

        int year = yearMonth.getYear();
        int month = yearMonth.getMonthValue();

        System.out.printf("Name: %s \nDepartament: %s%n", worker.getName(), worker.getDepartament().getName());
        System.out.print("Income for "+ StrcontractDate + " $ " + String.format("%.2f", worker.income(year, month)));
    }
}
