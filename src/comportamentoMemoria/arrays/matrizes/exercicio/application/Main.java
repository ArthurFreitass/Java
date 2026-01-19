package comportamentoMemoria.arrays.matrizes.exercicio.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number that represents the order of the matrix: ");
        int N = sc.nextInt();

        int [][] matrix = new int[N][N];

        for (int index = 0; index < matrix.length; index++) {
            for (int j = 0; j < matrix[index].length; j++) {
                System.out.print("Enter a number in the position: ["+index+"]["+j+"]: ");
                matrix[index][j] = sc.nextInt();
            }
        }

        System.out.println("\nOut:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMain diagonal:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
