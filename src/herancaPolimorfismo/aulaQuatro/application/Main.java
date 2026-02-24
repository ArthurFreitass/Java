package polimorfismo.application;

import polimorfismo.entities.Animal;
import polimorfismo.entities.Birds;
import polimorfismo.entities.Dog;

public class Main {
    public static void main(String[] args) {

        /*Polimorfismo é a utilização de um tipo genérico de classe
        * para a criação de variáveis de objetos diferentes que apontam
        * para objetos de tipos específicos diferentes*/

        Animal an1 = new Birds("Bird", "Bem-te-vi");
        Animal an2 = new Dog("Dog", "Rottweiller");

        // A utilização de métodos "iguais", instanciados em obj diferentes
        // É diferente
    }
}
