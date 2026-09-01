package lambda.comparator;

import lambda.comparator.entities.MyComparator;
import lambda.comparator.entities.Players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Players> players = new ArrayList<>();

        players.add(new Players("CR7", 1.87f, "ATA"));
        players.add(new Players("Neymar", 1.75f, "MEI"));
        players.add(new Players("Lamine", 1.80f, "PD"));


        System.out.println(players);

        /* Comparator<Players> comp = new Comparator<Players>() {
            @Override
            public int compare(Players p1, Players p2) {
                if (p1.getHeight() - p2.getHeight() > 0) {
                    return -1;
                } else if (p1.getHeight() - p2.getHeight() < 0) {
                    return 1;
                }
                return 0;
            } */

        // A form to use Comparator
        // players.sort(new MyComparator());

        // Two form players.sort(comp);

        players.sort((p1, p2) -> p1.getHeight().compareTo(p2.getHeight()));

        System.out.println("\n"+players);
    }
}
