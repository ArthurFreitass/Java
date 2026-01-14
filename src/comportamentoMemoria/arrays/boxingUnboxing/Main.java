package comportamentoMemoria.arrays.boxingUnboxing;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Fazendo boxing

        int x = 7;
        Integer numX = x; // Coloca numX dentro da classe Integer onde numX aponta pra classe onde está contido o objeto

        // Fazendo unboxing

        x = numX * 2;

        System.out.println(x);
    }
}
