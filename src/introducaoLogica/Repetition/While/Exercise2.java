package introducaoLogica.Repetition.While;

import java.util.Scanner;
import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int coordinateX = 1;
        int coordinateY = 1;
        String quadrantXY;

        while (coordinateX != 0 && coordinateY != 0) {
            coordinateX = sc.nextInt();
            coordinateY = sc.nextInt();
            if (coordinateX > 0 && coordinateY > 0) {
                quadrantXY = "Primeiro";
                System.out.println(quadrantXY);
            } else  if (coordinateX < 0 && coordinateY > 0) {
                quadrantXY = "Segundo";
                System.out.println(quadrantXY);
            } else if (coordinateX < 0 && coordinateY < 0) {
                quadrantXY = "Terceiro";
                System.out.println(quadrantXY);
            } else if (coordinateX == 0 || coordinateY == 0) {
                quadrantXY = "Sem quadrante";
                System.out.println(quadrantXY);
            }
            else {
                quadrantXY = "Quarto";
                System.out.println(quadrantXY);
            }
        }
        sc.close();
    }
}
