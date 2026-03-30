package trabalhandoArquivos.aulaDois.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/home/arthur-freitas/Documentos/documentoa.txt";
        FileReader fileReader = null; // Recebe o caminho do arquivo
        BufferedReader bufferedReader = null; // Recebe um FileReader

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine(); // Recebe a primeira linha do arquivo

            while (line != null) { // Checa se o texto do arquivo ainda não acabou
                System.out.println(line); // Escreve a linha
                line = bufferedReader.readLine(); // Consome a linha de embaixo
            }
        } catch (IOException error) {
            System.out.println(error.getMessage()); // Caso o arquivo não exista
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }
}
