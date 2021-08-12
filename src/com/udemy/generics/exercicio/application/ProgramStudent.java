package com.udemy.generics.exercicio.application;

import com.udemy.generics.exercicio.entities.Course;
import com.udemy.generics.exercicio.entities.Instructor;
import com.udemy.generics.exercicio.entities.Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Instructor instructor = new Instructor();
        instructor.setName("Alex");

        System.out.print("How many students for course A? ");
        int quantityA = sc.nextInt();

        Course courseA = new Course("A", instructor);
        courseA.setStudents(readCodes(quantityA, sc));

        System.out.print("How many students for course B? ");
        int quantityB = sc.nextInt();

        Course courseB = new Course("B", instructor);
        courseB.setStudents(readCodes(quantityB, sc));

        System.out.print("How many students for course C? ");
        int quantityC = sc.nextInt();

        Course courseC = new Course("C", instructor);
        courseC.setStudents(readCodes(quantityC, sc));

        instructor.setCourses(Arrays.asList(courseA, courseB, courseC));

        Set<Student> students = new HashSet<>();
        for (Course course : instructor.getCourses()) {
            students.addAll(course.getStudents());
        }

        System.out.println("Total students: " + students.size());

        sc.close();

    }

    public static Set<Student> readCodes(int quantity, Scanner scanner) {
        Set<Student> students = new HashSet<>();

        for (int i = 1; i <= quantity; i++) {
            Integer number = scanner.nextInt();
            students.add(new Student(number));
        }

        return students;
    }

}
