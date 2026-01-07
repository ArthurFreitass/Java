package construtoresThisSobrecargaEncapsulamento.construtores.testeExercicio.entities;

public class Product {

    private final int ID;
    private String name;
    private double price;
    private int quantity;

    public Product(int ID, String name, double price) {
        this.ID = ID;

        if (checkName(name)) {
            this.name = name;
        } else {
            this.name = "A confirmar";
        }

        if (checkValues(price)) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public Product(int ID, String name, double price, int quantity) {

        // Reaproveitando do outro construtor
        this(ID, name, price);

        if (checkValues(quantity)) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        }
    }

    public void addProducts(int quantity) {
        boolean result = checkValues(quantity);

        if (result) {
            this.quantity += quantity;
        }
    }

    public void removeProducts(int quantity) {
        boolean result = checkValues(quantity);

        if (result) {
            if (this.quantity >= quantity) {
                this.quantity -= quantity;
            }
        }
    }

    public String toString() {
        return "ID "+ getID() + ", Name: "+ getName() + ", Price: $ "+ getPrice() + ", Quantity: "+ getQuantity() + " units";
    }


    private boolean checkName(String name) {
        if (name != null && !name.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean checkValues(double value) {
        if (value < 0) return false;
        return true;
    }
}
