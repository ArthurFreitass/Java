package comportamentoMemoria.arrays.exercicios.exercicioUm.application;

import comportamentoMemoria.arrays.exercicios.exercicioUm.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração
        Person p;

        int x = sc.nextInt();

        if (x > 0) {
            p = new Person("Alex", 20);
        } else {
            p = new Person("Maria", 18);
        }

        System.out.println(p.getName() + " " + p.getAge() + " anos");
    }
}
