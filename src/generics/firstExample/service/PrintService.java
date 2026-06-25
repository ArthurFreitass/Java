package generics.firstExample.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    public PrintService() {
    }

    private List<T> numbers = new ArrayList<>();

    public void addValue(T num) {
        numbers.add(num);
    }

    public T first() {
        if (numbers.size() > 0) {
            return numbers.get(0);
        }
        throw new RuntimeException("Error: Enter a one number!");
    }

    public void print() {
        if (!numbers.isEmpty()) {
            String message = "[";
            for (int i = 0; i < numbers.size(); i++) {
                if (i < numbers.size() - 1) {
                    message += numbers.get(i) + ", ";
                } else {
                    message += numbers.get(i) + "]";
                }
            }
            System.out.println(message);
        }
    }

}

/*package generics.firstExample.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    public PrintService() {
    }

    private List<Integer> numbers = new ArrayList<>();

    public void addValue(int num) {
        numbers.add(num);
    }

    public int first() {
        if (numbers.size() > 0) {
            return numbers.get(0);
        }
        throw new RuntimeException("Error: Enter a one number!");
    }

    public void print() {
        if (!numbers.isEmpty()) {
            String message = "[";
            for (int i = 0; i < numbers.size(); i++) {
                if (i < numbers.size() - 1) {
                    message += numbers.get(i) + ", ";
                } else {
                    message += numbers.get(i) + "]";
                }
            }
            System.out.println(message);
        }
    }

}
*/
