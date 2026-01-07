package orientacaoObjetos.membrosEstaticos.exemploDois.application;

import orientacaoObjetos.membrosEstaticos.exemploDois.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double value = sc.nextDouble();

        sc.close();

        double circumference = Calculator.calculateCircumference(value);
        double volume = Calculator.calculateVolume(value);
        double PI = Calculator.PI;

        System.out.printf("Circuference: %.2f", circumference);
        System.out.printf("\nVolume: %.2f", volume);
        System.out.printf("\nPI: %.2f", PI);
    }
}
