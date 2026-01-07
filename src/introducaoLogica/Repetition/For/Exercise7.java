package introducaoLogica.Repetition.For;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int index = 1; index <= n; index += 1) {
            System.out.printf("%d  %.0f  %.0f%n", index, Math.pow(index, 2), Math.pow(index, 3));
        }

        sc.close();
    }
}
