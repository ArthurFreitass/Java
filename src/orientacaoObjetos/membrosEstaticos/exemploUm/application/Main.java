package orientacaoObjetos.membrosEstaticos.exemploUm.application;

import orientacaoObjetos.membrosEstaticos.exemploUm.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator value = new Calculator();

        System.out.print("Enter radius: ");
        value.radius = sc.nextDouble();

        sc.close();

        System.out.println(value);
    }
}
