package introducaoLogica.formatNumber;

import java.util.Locale;
public class Exercise {
    public static void main(String[] args) {
        // Exibir uma mensagem de acordo com os requisitos

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100;
        double price2 = 650;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s , which price is $ %.2f%n", product1, price1);
        System.out.printf("%s , whice price is $ %.2f%n", product2, price2);

        System.out.printf("\n%d years old, code %d and gender: %s%n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
