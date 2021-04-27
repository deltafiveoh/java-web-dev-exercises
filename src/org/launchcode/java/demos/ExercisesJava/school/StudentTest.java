package org.launchcode.java.demos.ExercisesJava.school;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student newStudent = new Student("Creed", 32, 1, 4.0);
        Student newStudent2 = new Student("Lorena", 45, 2, 4.0);

        ArrayList<String> mathTopics = new ArrayList<>();
        ArrayList<String> scienceTopics = new ArrayList<>();
        // add in whatever topics

        ArrayList<Student> mathStudents = new ArrayList<>();
        ArrayList<Student> scienceStudents = new ArrayList<>();
        // add in students as desired, such as newStudent in math and newStudent2 in science

        Course Math = new Course("Math", mathTopics, mathStudents);
        Course Science = new Course("Science", scienceTopics, scienceStudents);

        //likely would want to add teacher as a field in 'course'
        Teacher Ryan = new Teacher("Ryan", "Boor", "Math", 15);
        Teacher Jayde = new Teacher("Jayde", "Mitchell", "Science", 5);

    }
}
