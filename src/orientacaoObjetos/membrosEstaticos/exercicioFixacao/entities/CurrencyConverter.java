package orientacaoObjetos.membrosEstaticos.exercicioFixacao.entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double conversionValue(double dollarValue, double quantityDollars) {
        dollarValue += dollarValue * IOF;
        return dollarValue * quantityDollars;
    }
}
