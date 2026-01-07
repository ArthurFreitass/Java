package comportamentoMemoria.arrays.exerciciosFixacao.exercicioQuatro.entities;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (checkName(name)) {
            this.name = name;
        } else {
            this.name = "A confirmar";
        }

        if (checkAge(age)) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean checkName(String value) {
        boolean result = (value != null && !value.isEmpty());
        return result;
    }

    private boolean checkAge(int value) {
        boolean result = (value > 0);
        return result;
    }
}
