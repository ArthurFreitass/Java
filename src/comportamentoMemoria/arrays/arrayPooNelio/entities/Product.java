package comportamentoMemoria.arrays.arrayPooNelio.entities;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "A confirmar";
        }

        if (price > 0) {
            this.price = price;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
