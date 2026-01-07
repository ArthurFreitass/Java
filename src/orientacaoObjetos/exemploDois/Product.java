package orientacaoObjetos.exemploDois;

public class Product {
    public String nameProduct;
    public double priceProduct;
    public int stockQuantity;

    // criar um metódo de exibição

    public double totalValueInStock() {
        return priceProduct * stockQuantity;
    }

    public void addProduct(int stockQuantity) {
       this.stockQuantity += stockQuantity;
    }

    public void removeProduct(int stockQuantity) {
        this.stockQuantity -= stockQuantity;
    }

    public void displayProductData() {
        System.out.println("PRODUCT DETAILS");
        System.out.println("Name: "+nameProduct+
                "\nPrice: "+ priceProduct+
                "\nStock quantity: "+stockQuantity+
                "\nTotal value in stock: USD "+ totalValueInStock());
    }

    public String toString() {
        return "Update data: "+ nameProduct + " USD " + String.format ("%.2f", priceProduct)+ " " + stockQuantity + " units, total: USD "+ String.format("%.2f", totalValueInStock());
    }
}
