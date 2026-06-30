package generics.revision.entities;

import java.util.ArrayList;
import java.util.List;

public class Printer<T> {

    public Printer() {
    }

    private List<T> list = new ArrayList<>();

    public void addInList(T value) {
        list.add(value);
    }

    public void removeInList(int i) {
        if (list.get(i) == null) {
            throw new RuntimeException("Error: Invalid indexOf");
        }
        list.remove(i);
    }

    public void print() {
        for (T ele : list) {
            System.out.println(ele);
        }
    }
}
