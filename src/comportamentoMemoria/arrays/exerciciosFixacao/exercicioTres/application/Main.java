package comportamentoMemoria.arrays.exerciciosFixacao.exercicioTres.application;

import comportamentoMemoria.arrays.exerciciosFixacao.exercicioTres.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int response = sc.nextInt();
        sc.nextLine();

        if (response > 0) {
            Person[] p = new Person[response]; // Criar um array de objetos / referências de N pessoas
            for (int index = 0; index < p.length; index ++) {
                System.out.println("Dados da " + (index + 1) + "º pessoa: ");
                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Idade: ");
                int age = sc.nextInt();

                System.out.println("Altura: ");
                double height = sc.nextDouble();

                // Criar o objeto na referência
                p[index] = new Person(name, age, height);
                System.out.println();
            }

            double sumHeight = 0;

            for (int index = 0; index < p.length; index += 1) {
                sumHeight += p[index].getHeight();
            }

            double avgHeight = sumHeight / p.length; // Alt média

            double totalAges = p.length;

            double agesUnderSixTeen = 0;

            String namesAgeUnderSix = "";

            for (int index = 0; index < p.length; index++) {
                if (p[index].getAge() < 16) {
                    agesUnderSixTeen++;
                    namesAgeUnderSix += "\n" + p[index].getName() + "\n";
                }
            }

            double percentageAges = agesUnderSixTeen / totalAges * 100;

            System.out.printf("Altura média: %.2f \nPessoas com menos de 16 anos: %.2f % %s%n", avgHeight, percentageAges, namesAgeUnderSix);
        } else {
            System.out.println("ERRO! Digite um número maior que zero!");
        }
    }
}
