package generics.set.test;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Set<SoccerPlayer> soccerPlayers = new TreeSet<>();

        soccerPlayers.add(new SoccerPlayer("Lamine Yamal", 19));
        soccerPlayers.add(new SoccerPlayer("Neymar", 34));
        soccerPlayers.add(new SoccerPlayer("Mbappé", 27));

        for (Object i : soccerPlayers) {
            System.out.println(i);
        }

        // O TreeSet ordenou automaticamente através do método CompareTo() implementado na classe SoccerPlayer
    }
}
