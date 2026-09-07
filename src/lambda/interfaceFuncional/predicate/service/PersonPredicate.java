package lambda.interfaceFuncional.predicate.service;

import lambda.interfaceFuncional.predicate.entities.Person;

import java.util.function.Predicate;

public class PersonPredicate implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getHeight() < 1.75;
    }
}
