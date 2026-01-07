package introducaoLogica.OperatorsExercise;

import java.util.Locale;
import java.util.Scanner;

public class FourExercise {
    public static void main(String[] args) {

        int numberEmployee;
        double hourSalary;
        float hoursWorked;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        numberEmployee = sc.nextInt();
        hourSalary = sc.nextDouble();
        hoursWorked = sc.nextFloat();

        sc.close();

        double salary = (double) hourSalary * hoursWorked;

        System.out.println("NUMBER = "+ numberEmployee);
        System.out.print("SALARY = U$ "+ salary);

    }
}
