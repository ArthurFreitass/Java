package comportamentoMemoria.arrays.List.exercise.application;

import comportamentoMemoria.arrays.List.exercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int nEmployees = sc.nextInt();

        if (nEmployees > 0) {

            // Cria Lista local com List
            List<Employee> employees = new ArrayList<>();

            for (int i = 0; i < nEmployees; i++) {

                System.out.println("EMPLOYEE #"+ (i + 1) +":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("NAME: ");
                String name = sc.nextLine();
                System.out.print("SALARY: ");
                double salary = sc.nextDouble();

                // Instância o objeto

                System.out.println();

                employees.add(new Employee(id, name, salary));
            }

            System.out.print("Enter the employee id that will have salary increase: ");
            int idEmployee = sc.nextInt();

            Employee num = employees.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

            if (num != null) {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();

                num.increaseSalary(percentage);

            } else {
                System.out.println("This id does not exist!");
            }

            System.out.println();

            for (Employee obj : employees) {
                System.out.println(obj);
            }
        } else {
            System.out.println("\nERROR: There must be at least one employee");
        }

        sc.close();
    }
}
