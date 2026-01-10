package comportamentoMemoria.arrays.exercicioPensionato.entities;

public class Pension {

    private String name;
    private String email;
    private int numberRoom;

    public Pension(String name, String email, int numberRoom) {
        this.name = name;
        this.email = email;
        this.numberRoom = numberRoom;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome: " + name + ", E-mail: "+ email;
    }
}
