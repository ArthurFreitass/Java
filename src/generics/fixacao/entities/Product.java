package generics.fixacao.entities;

import generics.fixacao.exceptions.DomainException;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if (quantity == null) {
            throw new DomainException("Error: Quantity cannot be null!");
        }
        if (quantity <= 0) {
            throw new DomainException("Error: Quantity cannot be less or than equal zero!");
        }
        this.quantity = quantity;
    }

    public Product(String name, Double price, Integer quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new DomainException("Error: Name cannot be null!");
        }
        if (name.isEmpty()) {
            throw new DomainException("Error: Name cannot be empty!");
        }
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null) {
            throw new DomainException("Error: Price cannot be null!");
        }
        if (price < 0) {
            throw new DomainException("Error: Price cannot be less than zero!");
        }
        this.price = price;
    }


    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) {
            return -1;
        }
        if (this.price < o.price) {
            return 1;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " un.";
    }
}
