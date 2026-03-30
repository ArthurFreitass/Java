package trabalhandoArquivos.revisao.Dois.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "/home/arthur-freitas/Downloads/HelloWorld.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(fileReader = new FileReader(path));
            String lines = bufferedReader.readLine();

            // Cria uma String de linhas

            while (lines != null) {
                System.out.println(lines);
                lines = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
