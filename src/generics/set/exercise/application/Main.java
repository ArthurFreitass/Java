package generics.set.exercise.application;

import generics.set.exercise.model.entities.Course;
import generics.set.exercise.model.entities.Instructor;
import generics.set.exercise.model.entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Instructor instructor = new Instructor("Alex");

            Course c1 = new Course("A");
            Course c2 = new Course("B");
            Course c3 = new Course("C");

            instructor.addCourse(c1);
            instructor.addCourse(c2);
            instructor.addCourse(c3);

            System.out.print("How many students for course A? ");
            int nStudents = sc.nextInt();

            if (nStudents > 0) {
                for (int i = 0; i < nStudents; i++) {
                    c1.addUser(new User(sc.nextInt()));
                }
            }


        }
    }
}
