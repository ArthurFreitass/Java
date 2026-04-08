package trabalhandoArquivos.exercicio.model.entities;

import trabalhandoArquivos.exercicio.model.exceptions.DomainException;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        if (name.isEmpty()) {
            throw new DomainException("Error: Invalid name.");
        }
        if (price <= 0) {
            throw new DomainException("Error: Invalid price");
        }
        if (quantity <= 0) {
            throw new DomainException("Error: Invalid quantity");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Método para o valor total

    public double totalValue() {
        return quantity * price;
    }

    public String toString() {
        return name+","+String.format("%.2f", totalValue());
    }
}
