package org.launchcode.java.demos.ExercisesJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentID;

        System.out.println("Enter your students (or enter 0 to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentID = input.nextInt();

            if (newStudentID != 0) {
                System.out.print("Student Name: ");
                String newStudent = input.next();
                students.put(newStudentID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(newStudentID != 0);

        // Print class roster
        System.out.println("\nClass roster:");

        System.out.println(students.values());

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID " + student.getKey() + ": " + student.getValue());
        }
    }

}
