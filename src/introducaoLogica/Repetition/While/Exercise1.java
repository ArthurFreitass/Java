package introducaoLogica.Repetition.While;

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        int password = 2002;
        String message;

        Scanner sc = new Scanner(System.in);
        int attemptPassword = sc.nextInt();

        while (attemptPassword != password) {
            message = "Senha invalida";
            System.out.printf("%s%n", message);
            attemptPassword = sc.nextInt();
        }

        sc.close();

        message = "Acesso permitido";
        System.out.println(message);
    }
}
