package lambda.interfaceFuncional.predicate.application;

import lambda.interfaceFuncional.predicate.entities.Person;
import lambda.interfaceFuncional.predicate.service.PersonPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        try {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Person 1", 1.54));
            people.add(new Person("Person 2", 1.80));
            people.add(new Person("Person 3", 1.72));
            people.add(new Person("Person 4", 1.65));
            people.add(new Person("Person 5", 1.78));

            // people.removeIf(Person::nostaticBooleanPredicate); // Reference method

            // Declarates a lambda expression

            Predicate<Person> personPredicate = p -> p.getHeight() < 1.75;

            // Inline
            people.removeIf((p) -> p.getHeight() < 1.75);

            System.out.println(people);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // It doesn't work;
    /*    private static List<Person> removeHeightLess175(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHeight() < 1.75) {
                list.remove(i);
            }
        }
        return list;
    }*/
}
