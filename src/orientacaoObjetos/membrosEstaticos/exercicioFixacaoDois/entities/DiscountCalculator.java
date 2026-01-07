package orientacaoObjetos.membrosEstaticos.exercicioFixacaoDois.entities;

// Apenas realiza cálculos sem a necessidade de alterar o objeto
public class DiscountCalculator {
    public static final double DISCOUNT = 0.10;

    public static double finalPrice(double price) {
        return price - price * DISCOUNT;
    }
}
