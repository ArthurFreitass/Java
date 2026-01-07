package introducaoLogica.Repetition.For;

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int countInInterval = 0;
        int countOutInterval = 0;

        for (int index = 0; index < n; index += 1) {
            num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                countInInterval++;
            } else
                countOutInterval++;
        }
        sc.close();
        System.out.printf("%d in, %d out%n", countInInterval, countOutInterval);
    }
}
