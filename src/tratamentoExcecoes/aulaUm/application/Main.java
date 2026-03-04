package tratamentoExcecoes.aulaUm.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // O bloco try tenta executar um bloco de código, se um erro for lançado ele basicamente é capturado pelo catch

        try {

            String[] array = sc.nextLine().split(" ");
            int position = sc.nextInt(); // InputIsMath

            System.out.println(array[position]); // ArrayIndex

            // Pode ocasionar duas exceções
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }
        System.out.println("End program");
    }
}
