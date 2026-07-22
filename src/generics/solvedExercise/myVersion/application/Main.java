package generics.solvedExercise.myVersion.application;

import generics.solvedExercise.myVersion.exceptions.DomainException;
import generics.solvedExercise.myVersion.model.entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        String path;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter file full path: ");
            path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line = br.readLine();
                Set<Log> logs = new HashSet<>();

                while (line != null) {

                    String [] arr = line.split(" ");
                    logs.add(new Log(arr[0], Instant.parse(arr[1])));

                    line = br.readLine();
                }
                System.out.println("Total users: " + logs.size());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }
}
