package generics.set.exercise.application;

import generics.set.exercise.model.entities.Course;
import generics.set.exercise.model.entities.Instructor;
import generics.set.exercise.model.entities.User;
import generics.set.exercise.model.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Instructor instructor = returnsInstructorWithCourses("Alex", sc);
            addStudentsToCourse(instructor.getCourseList(), sc);

            System.out.println("\nTotal Students: "+ instructor.getStudents().size());
            sc.close();
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addStudentsToCourse(List<Course> courseList, Scanner sc) {
        for (int i = 0; i < courseList.size(); i++) { // Percorre o curso
            System.out.print("\nHow many students for course "+ courseList.get(i).getName() + "? ");
            int n = sc.nextInt(); sc.nextLine();

            if (n > 0) {
                for (int j = 0; j < n; j++) {
                    courseList.get(i).addUser(new User(sc.nextInt()));
                    sc.nextLine();
                }
            } // Percorre o número de alunos
        }
    }

    public static Instructor returnsInstructorWithCourses(String name, Scanner sc) {

        Instructor instructor = new Instructor(name);

        System.out.print("\nEnter a course number: ");
        int courseNumber = sc.nextInt(); sc.nextLine();

        if (courseNumber > 0) {
            List<Course> courseList = new ArrayList<>();
            System.out.println("Enter a courses names:");
            for (int i = 0; i < courseNumber; i++) {
                System.out.print("Course ["+ (i + 1) +"]: ");
                instructor.addCourses(new Course(sc.nextLine()));
            }

            return instructor;

        } else {
            throw new DomainException("Number courses cannot be less or equal than zero");
        }
    }
}
