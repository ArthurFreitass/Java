package trabalhandoArquivos.aulaUm.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lendo um arquivo.txt com a classe Scanner

        File file = new File("/home/arthur-freitas/Documentos/documento.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException error) {
            System.out.println(error.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}