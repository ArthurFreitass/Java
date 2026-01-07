package orientacaoObjetos.exercicios.exercicioEscola.entities;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double totalNote() {
        return note1 + note2 + note3;
    }

    public String studentResult() {
        double total = totalNote();
        if (total < 60) {
            return "FAILED \nMISSING "+ (60 - total) + " POINTS";
        }
        return "PASS";
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", totalNote()) + "\n" + studentResult();
    }

    public boolean isValid() {
      double currentTotal = totalNote();
        return currentTotal >= 0 && currentTotal <= 100;
    }
}
