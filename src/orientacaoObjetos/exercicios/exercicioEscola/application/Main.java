package orientacaoObjetos.exercicios.exercicioEscola.application;

import orientacaoObjetos.exercicios.exercicioEscola.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your name and your three grades:");
        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        if (student.isValid()) {
            System.out.println("\n"+student);
        } else
            System.out.println("\nError: Invalid notes.");
    }
}
