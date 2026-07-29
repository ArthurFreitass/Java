package generics.map.firstClass.application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> localStorage = new TreeMap<>();

        localStorage.put("username", "Maria");
        localStorage.put("email", "maria@email.com");
        localStorage.put("password", "123456");
        localStorage.put("address", "undefined");

        localStorage.remove("address");

        for (String key : localStorage.keySet()) {
            System.out.println(key + ": " + localStorage.get(key));
        }

        // Valores

        System.out.println("\n"+localStorage.values());

        System.out.println("\nlocalStorage contains address : "+ localStorage.containsKey("address"));

        // Testando um valor que não existe

        System.out.println("Address: " + localStorage.get("address"));
    }
}
