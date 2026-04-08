package trabalhandoArquivos.exercicio.application;

import trabalhandoArquivos.exercicio.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        // Cria uma variável para ler o caminho que a pasta out será gerada

        File path = new File(strPath);

        boolean outSucess = new File(path + "//out").mkdir();

        // Cria pasta

        String strPathFile = sc.nextLine();

        // Caminho do arquivo

        try (BufferedReader bf = new BufferedReader(new FileReader(strPathFile)); // Recebe o arquivo
             BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/out/summary.csv")))  { // Criar o arquivo

            Locale.setDefault(Locale.US);

            String line = bf.readLine(); // Lê uma linha caso o arquivo exista, se false = null
            List<Product> products = new ArrayList<>(); // Array de produtos

            while (line != null) { // Verifica se existe dados no arquivo

                String [] productValues = line.split(","); // Pega as partes separadas por ,
                line = bf.readLine(); // Recebe a próxima posição

                String name = productValues[0];
                double price = Double.parseDouble(productValues[1]);
                int quantity = Integer.parseInt(productValues[2]);

                products.add(new Product(name, price, quantity)); // Instância
            }
            // Criando o arquivo
            for (Product p : products) {
                bw.write(""+p);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
