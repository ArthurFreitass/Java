package generics.secondExample.entities;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Error: Name cannot be null or empty");
        }
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            throw new RuntimeException("Error: Price cannot be less or than zero!");
        }
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
