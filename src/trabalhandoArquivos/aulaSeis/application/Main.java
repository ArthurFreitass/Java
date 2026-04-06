package trabalhandoArquivos.aulaSeis.application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String strPath = sc.nextLine();
            File path = new File(strPath);
            System.out.println();

            System.out.println(path.getName());
            System.out.println(path.getPath());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
