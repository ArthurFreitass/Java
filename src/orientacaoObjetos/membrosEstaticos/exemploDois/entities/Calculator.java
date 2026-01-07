package orientacaoObjetos.membrosEstaticos.exemploDois.entities;

public class Calculator {
    public static final double PI = 3.14;

    public static double calculateCircumference(double radius) {
        return 2 * radius * PI;
    }

    public static double calculateVolume(double radius) {
        return 4 * PI * Math.pow(radius, 3.0) / 3;
    }
}
