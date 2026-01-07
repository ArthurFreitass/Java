package comportamentoMemoria.arrays.exerciciosFixacao.exercicioTres.entities;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "A confirmar";
        }

        if (age > 0) {
            this.age = age;
        }

        if (height > 0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
