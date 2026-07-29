package generics.map.exercise.application;

import generics.map.exercise.model.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Map<Candidate, Integer> candidates = readFile(sc);
        relatory(candidates);

        sc.close();
    }

    private static Map<Candidate, Integer> readFile(Scanner sc) {
        System.out.print("Enter a path file: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<Candidate, Integer> candidatesDicionary = new HashMap<>();

            String line;

            while ((line = br.readLine()) != null) {
                if (candidatesDicionary.containsKey(new Candidate(line.split(",")[0]))) {
                    // Votos atuais                                       // Novos votos
                    int votes = candidatesDicionary.get(new Candidate(line.split(",")[0])) + Integer.parseInt(line.split(",")[1].trim());
                    candidatesDicionary.put(new Candidate(line.split(",")[0]), votes);
                } else {
                    candidatesDicionary.put(new Candidate(line.split(",")[0]), Integer.parseInt(line.split(",")[1].trim()));
                }
            }
            return candidatesDicionary;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Map.of();
    }

    private static void relatory(Map<Candidate, Integer> dicionaryCandidate) {
        System.out.println("Total votes");
        for (Candidate key : dicionaryCandidate.keySet()) {
            System.out.println(key + ": "+ dicionaryCandidate.get(key));
        }
    }
}
