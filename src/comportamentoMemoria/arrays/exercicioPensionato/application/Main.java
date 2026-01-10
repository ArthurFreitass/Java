package comportamentoMemoria.arrays.exercicioPensionato.application;

import comportamentoMemoria.arrays.exercicioPensionato.entities.Pension;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 10 Quartos - de 0 a 9

        // Posso criar o objeto na memória

        Pension[] room = new Pension[10];

        System.out.print("Entre com a quantidade de estudantes que vão alugar os quartos 1 a 10: ");
        int quantityPeople = sc.nextInt();
        sc.nextLine();

        if (checkQuantity(quantityPeople)) {

            System.out.println("\nEfetue o registro de aluguel dos "+ quantityPeople + " estudantes:\n");

            for (int index = 0; index < quantityPeople; index += 1) {
                System.out.println("Entre com os dados do "+ (index + 1) +"º estudante: ");

                System.out.print("Digite o nome do estudante: ");
                String name = sc.nextLine();

                System.out.print("Digite seu endereço de e-mail: ");
                String email = sc.next();

                System.out.print("Digite o número do quarto [0 a 9]: ");
                int numRoom = sc.nextInt();

                sc.nextLine();

                System.out.println();

                if (checkAvailability(room, numRoom)) {
                    // Cria o objeto
                    room[numRoom] = new Pension(name, email, numRoom);
                } else {
                    System.out.println("Desculpe, quarto já foi hospedado!");
                }
            }

            System.out.println("\nRelátorio dos quartos escolhidos:");
            String messageRelatory = roomsOccupied(room);
            System.out.println(messageRelatory);
            System.out.println("\nObrigado por utilizar nossos sistemas! :)");
        } else {
            System.out.println("ERRO: Entre com uma quantidade maior que zero!");
        }
    }

    public static boolean checkQuantity(int value) {
        return value > 0;
    }

    public static boolean checkAvailability(Pension[] room, int position) {
        return room[position] == null;
    }

    public static String roomsOccupied(Pension[] room) {
        String messageOut = "";
        for (int i = 0 ;i < room.length; i++) {
            if (room[i] != null) {
                messageOut += "\n QUARTO "+ room[i].getNumberRoom() +"\n"+
                "\nNOME: "+ room[i].getName() +
                "\nEMAIL: "+ room[i].getEmail();
            }
        }
        return messageOut;
    }
}
