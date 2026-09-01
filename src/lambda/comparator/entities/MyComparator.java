package lambda.comparator.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Players> {

    @Override
    public int compare(Players p1, Players p2) {
        return p1.getHeight().compareTo(p2.getHeight());
    }
}
