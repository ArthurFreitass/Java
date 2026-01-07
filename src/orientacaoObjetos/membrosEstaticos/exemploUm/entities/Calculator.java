package orientacaoObjetos.membrosEstaticos.exemploUm.entities;

public class Calculator {
    public double radius;
    public static final double PI = 3.14;

    public double calculateCircumference() {
        return 2 * radius * PI;
    }

    public double calculateVolume() {
        return 4 * PI * Math.pow(radius, 3.0) / 3;
    }


    public String toString() {
        return "Circumference: "+ calculateCircumference() +
                "\nVolume: "+ calculateVolume() +
                "\nPI value: "+ PI;
    }
}
