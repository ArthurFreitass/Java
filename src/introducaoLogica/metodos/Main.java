package introducaoLogica.metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        int higher = max(num1, num2, num3);
        showResult(higher);

    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return  a;
        } else if (b > c) {
            return b;
        } else
            return c;
    }

    public static void showResult(int num) {
        System.out.printf("Higher = %d%n", num);
    }
}
