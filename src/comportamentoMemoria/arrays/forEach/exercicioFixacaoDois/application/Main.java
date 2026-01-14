package comportamentoMemoria.arrays.forEach.exercicioFixacaoDois.application;

import comportamentoMemoria.arrays.forEach.exercicioFixacaoDois.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número de funcionários da empresa? ");
        int nEmployees = sc.nextInt();
        sc.nextLine();

        if (nEmployees > 0) {
            Employee[] employee = new Employee[nEmployees];

            for (int index = 0; index < employee.length; index += 1) {
                System.out.print("Digite o nome do funcionário: ");
                String name = sc.nextLine();

                System.out.println("Digite o seu salário: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                employee[index] = new Employee(name, salary);
            }

            for (Employee e : employee) {
                e.applyIncrease();
                System.out.println(e);
            }
        }

    }
}
