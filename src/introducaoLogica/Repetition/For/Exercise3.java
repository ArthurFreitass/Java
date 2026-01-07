package introducaoLogica.Repetition.For;

import java.util.Scanner;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        double note1;
        double note2;
        double note3;
        double [] averageP = new double[n];

        for (int index = 0; index < n; index++) {
            note1 = sc.nextDouble();
            note2 = sc.nextDouble();
            note3 = sc.nextDouble();

            averageP[index] = ((note1 * 2) + (note2 * 3) + (note3 * 5)) / (2 + 3 + 5);
        }
        sc.close();

        for (int i = 0; i < averageP.length; i += 1) {
            System.out.printf("%.1f%n", averageP[i]);
        }
}
}
