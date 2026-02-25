package exercicioProposto.application;

import exercicioProposto.entities.Employee;
import exercicioProposto.entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number of employees: ");
       int nEmployees = sc.nextInt();
       sc.nextLine();

       System.out.println("Enter the employee data: ");

       List<Employee> employeeList = new ArrayList<>();
       for (int i = 0; i < nEmployees; i++) {
           String name;
           int hours;
           double valuePerHour;
           double additionalCharge;

           System.out.println("Employee #" + (i + 1) + " data: ");
           System.out.print("Outsourced (y/n)? ");
           char responseOutsourced = sc.next().charAt(0);
           sc.nextLine();

           if (responseOutsourced == 'y') {
               System.out.print("Name: ");
               name = sc.nextLine();
               System.out.print("Hours: ");
               hours = sc.nextInt();
               sc.nextLine();
               System.out.print("Value per hours: ");
               valuePerHour = sc.nextDouble();
               sc.nextLine();
               System.out.print("Additional charge: ");
               additionalCharge = sc.nextDouble();
               sc.nextLine();
               employeeList.add(new OutSourceEmployee(name, hours, valuePerHour, additionalCharge));
           } else {
               System.out.print("Name: ");
               name = sc.nextLine();
               System.out.print("Hours: ");
               hours = sc.nextInt();
               sc.nextLine();
               System.out.print("Value per hours: ");
               valuePerHour = sc.nextDouble();
               sc.nextLine();
               employeeList.add(new Employee(name, hours, valuePerHour));
           }
       }

       System.out.println("\nPAYMENTS:");
       for (Employee employee : employeeList) {
           if (employee instanceof OutSourceEmployee) {
               System.out.println(employee);
           } else {
               System.out.println(employee);
           }
       }
     sc.close();
   }
}
