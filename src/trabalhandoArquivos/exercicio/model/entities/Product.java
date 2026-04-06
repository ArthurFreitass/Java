package trabalhandoArquivos.exercicio.model.entities;

import model.exceptions.DomainException;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        if (name == null || name.isEmpty()) {
            throw new DomainException("Error: Name product invalid!");
        }
        if (price == null || price <= 0) {
            throw new DomainException("Error: Price product invalid!");
        }
        if (quantity == null || quantity < 0) {
            throw new DomainException("Error: Quantity product invalid!");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        if (price == null || price <= 0) {
            throw new DomainException("Error: Price product invalid!");
        }
        this.price = price;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new DomainException("Error: Name product invalid!");
        }
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        if (quantity == null || quantity < 0) {
            throw new DomainException("Error: Quantity product invalid!");
        }
        this.quantity = quantity;
    }


    public String toString() {
        return "Product data: \n" +
                "Name: " + name + "\n" +
                "Price: "+ price + "\n" +
                "Quantity: " + quantity;
    }
}
