package trabalhandoArquivos.exercicio.application;

import trabalhandoArquivos.exercicio.model.entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        try (BufferedReader bw = new BufferedReader(new FileReader(strPath));) {

            File path = new File(strPath);

            // Ler as linhas do arquivo

            String fileContent = bw.readLine();

            List<Product> products = new ArrayList<>();

            while (fileContent != null) {
                // Instânciar Produto aqui

                String [] productValues = fileContent.split(",");
                Double price = Double.parseDouble(productValues[1]);
                Integer quantity = Integer.parseInt(productValues[2]);

                products.add(new Product(productValues[0], price , quantity));

                fileContent = bw.readLine();
            }

        }
    }
}
