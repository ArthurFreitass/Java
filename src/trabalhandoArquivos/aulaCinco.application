package trabalhandoArquivos.aulaCinco.application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter a path for folder: ");

            String path = sc.nextLine();
            System.out.println();

            File file = new File(path);

            File[] folders = file.listFiles(File::isDirectory); // Pega todas as pastas
            File[] files = file.listFiles(File::isFile);

            System.out.println("Folders");
            for (File folder : folders) {
                System.out.println(folder);
            }
            System.out.println();
            System.out.println("Files");
            for (File f : files) {
                System.out.println(f);
            }

            // Criando subpasta

            boolean sucess = new File(path + "\\novaPasta").mkdir();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
