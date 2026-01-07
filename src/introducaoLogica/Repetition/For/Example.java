package introducaoLogica.Repetition.For;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int nNumbers;
        int sum = 0;

        for (int index = 0; index < num; index++) {
            nNumbers = sc.nextInt();
            sum += nNumbers;
        }
        sc.close();
        System.out.printf("SUM = %d", sum);
    }
}
