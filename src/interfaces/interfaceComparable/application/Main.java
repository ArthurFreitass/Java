package interfaces.interfaceComparable.application;

import interfaces.interfaceComparable.model.entities.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "";

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a source of path file:");

            // Lê o arquivo
            path = sc.nextLine();

        } catch (RuntimeException e) {
            System.out.println("Não rodou = "+ e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            // Criar uma lista para armazenar cada nome

            List<People> peopleList = new ArrayList<>(); // Cria a lista de pessoas

            String line = bufferedReader.readLine();

            while (line != null) {
                // people recebe a lista
                peopleList.add(new People(line));
                System.out.println(line);
                line = bufferedReader.readLine(); // Próxima linha
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
