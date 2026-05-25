package interfaces.interfaceComparable.dois.application;

import interfaces.interfaceComparable.dois.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            String path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                List<Employee> list = new ArrayList<>();

                String line = br.readLine();

                while (line != null) {
                    // Array
                    list.add(new Employee(line.split(",")[0], Double.parseDouble(line.split(",")[1])));
                    line = br.readLine();
                }

                // Formatar
                Collections.sort(list);

                for (Employee e : list) {
                    System.out.println(e);
                }

            } catch (RuntimeException e) {
                e.getMessage();
                e.printStackTrace();
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
