package comportamentoMemoria.arrays.exerciciosFixacao.exercicioQuatro.application;

import comportamentoMemoria.arrays.exerciciosFixacao.exercicioQuatro.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos você irá adicionar ao programa: ");
        int nPeople = sc.nextInt();
        sc.nextLine();

        if (nPeople > 0) {
            Person[] p = new Person[nPeople];

            for (int i = 0; i < p.length; i++) {
                System.out.println("Dados da "+ (i + 1) +" a pessoa:");

                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Idade: ");
                int age = sc.nextInt();
                sc.nextLine();

                p[i] = new Person(name, age);
            }

            int olderPerson = p[0].getAge();
            String nameOlderPerson = p[0].getName();

            for (int i = 1; i < p.length; i++) {
                if (p[i].getAge() > olderPerson) {
                    olderPerson = p[i].getAge();
                    nameOlderPerson = p[i].getName();
                }
            }

            System.out.printf("PESSOA MAIS VELHA = %s%n", nameOlderPerson);

        } else {
            System.out.println("\nERRO: O número deve ser maior que zero.");
        }

        sc.close();
    }

}
