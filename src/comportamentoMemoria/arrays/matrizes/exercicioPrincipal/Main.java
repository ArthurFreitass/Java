package comportamentoMemoria.arrays.matrizes.exercicioPrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrix: ");
        int nRows = sc.nextInt();
        int nCol = sc.nextInt();

        int [][] matrix = new int[nRows][nCol];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nEnter a number that exists in the array: ");
        int num = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == num) {
                    System.out.println("Position ["+i+"]["+j+"]");

                        System.out.print("Left: ");
                        if (j > 0) {
                            System.out.println(matrix[i][j - 1]);
                        }
                        if (j + 1 < matrix[i].length ) { // Colunas
                            System.out.print("Right:");
                            System.out.println(matrix[i][j + 1]);
                        }
                        if (i + 1 < matrix.length) { // Linhas
                            System.out.print("Down:");
                            System.out.println(matrix[i + 1][j]);
                        }
                        if (i > 0) {
                            System.out.print("Up:");
                            System.out.println(matrix[i - 1][j]);
                        }
                }
            }
        }
        sc.close();
    }
}
