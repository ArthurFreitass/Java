package tratamentoExcecoes.aulaDois.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void method2() {
        System.out.println("--METHOD2 Start--");
        method1();
        System.out.println("--Final METHOD1--");
    }
    public static void method1() {
        System.out.println("--METHOD1 Start--");
        Scanner sc = new Scanner(System.in);

        try {

            String[] array = sc.nextLine().split(" ");
            int position = sc.nextInt(); // InputIsMath

            System.out.println(array[position]); // ArrayIndex

            // Pode ocasionar duas

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        }

        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("--Final METHOD1--");
    }

    public static void main(String[] args) {
        method2();
        System.out.println("End program!");
    }
}
