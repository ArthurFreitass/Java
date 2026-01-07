package comportamentoMemoria.arrays.exercicios.exercicioDois.entities;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
