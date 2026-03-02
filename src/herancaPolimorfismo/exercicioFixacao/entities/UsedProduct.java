package herancaPolimorfismo.exercicioFixacao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

     public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
     }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public final String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + fmt.format(manufactureDate) + ")";
    }
}
