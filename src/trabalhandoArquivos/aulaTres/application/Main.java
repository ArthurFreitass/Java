package trabalhandoArquivos.aulaTres.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/home/arthur-freitas/Documentos/documento.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine(); // Recebe a primeira linha do arquivo

            while (line != null) { // Checa se o texto do arquivo ainda não acabou
                System.out.println(line); // Escreve a linha
                line = bufferedReader.readLine(); // Consome a linha de embaixo
            }
        } catch (FileNotFoundException error) {
            System.out.println(error.getMessage()); // Caso o arquivo não exista
        } catch (IOException error) {
            System.out.println("Erro: Erro de entrada ou de saída!");
        }
    }
}
