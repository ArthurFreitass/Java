package comportamentoMemoria.arrays.List.exercise.application;

import comportamentoMemoria.arrays.List.entities.Employee;

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

            for (int i = 0; i < employees.size(); i++) {

                System.out.println("EMPLOYEE #"+ i +":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("NAME: ");
                String name = sc.nextLine();
                System.out.print("SALARY: ");
                double salary = sc.nextDouble();

                // Instância o objeto

                employees.add(new Employee(id, name, salary));
            }
        }

        sc.close();
    }
}
