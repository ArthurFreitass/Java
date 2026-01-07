package comportamentoMemoria.arrays.exercicios.exercicioTres.application;

import comportamentoMemoria.arrays.exercicios.exercicioTres.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Account acc1 = new Account("Carlos", 1000);
        Account acc2 = acc1;

        acc2.withdraw(200);

        System.out.printf("Holder %s, Balance %.2f%n", acc1.getHolder(), acc1.getBalance());
    }
}
