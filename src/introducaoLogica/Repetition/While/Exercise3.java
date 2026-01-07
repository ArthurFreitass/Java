package introducaoLogica.Repetition.While;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        // 1 - Alcool 2 - Gasolina 3 - Diesel 4 - Fim

        int countAlcool = 0;
        int countGasoline = 0;
        int countDiesel = 0;

        Scanner sc = new Scanner(System.in);
        int choiceUser = sc.nextInt();

        while (choiceUser != 4) {
            choiceUser = sc.nextInt();
            switch (choiceUser) {
                case 1:
                    countAlcool++;
                    break;
                    case 2:
                        countGasoline++;
                        break;
                        case 3:
                        countDiesel++;
                        break;
            }
        }

        sc.close();

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + countAlcool);
        System.out.println("Gasoline: " + countGasoline);
        System.out.println("Diesel: " + countDiesel);
    }
}
