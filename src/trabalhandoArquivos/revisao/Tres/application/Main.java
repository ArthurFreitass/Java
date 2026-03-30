package trabalhandoArquivos.revisao.Tres.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "/home/arthur-freitas/Downloads/HelloWorld.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String lines = bufferedReader.readLine();
            bufferedReader.readLine();

            while (bufferedReader != null) {
                System.out.println(lines);
                lines = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
