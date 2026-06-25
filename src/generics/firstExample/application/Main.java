package generics.firstExample.application;

import generics.firstExample.service.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many values? ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n > 0) {
                PrintService<Integer> printService = new PrintService<>();

                for (int i = 0; i < n; i++) {
                    int num = sc.nextInt();
                    sc.nextLine();
                    printService.addValue(num);
                }

                printService.print();
                System.out.println("First: " + printService.first());

            } else {
                System.out.println("Leaving the system!");
            }
        }
    }
}
