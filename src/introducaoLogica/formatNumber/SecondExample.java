package introducaoLogica.formatNumber;

public class SecondExample {
    public static void main(String[] args) {
        String name = "Goku";
        int age = 31;
        double salary = 3000;

        // Exibindo com souf (%s = texto / %d = inteiros / %f = decimais / %n = quebra linha)
        System.out.printf("%s têm %d anos, e recebe R$ %.2f por mês%n", name, age, salary);
    }
}
