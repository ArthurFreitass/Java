package trabalhandoArquivos.revisao.Um.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException  {

        File file = new File("/home/arthur-freitas/Downloads/HelloWorld.txt");
        // Cria a classe file e a instância com o caminho de um arquivo

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
