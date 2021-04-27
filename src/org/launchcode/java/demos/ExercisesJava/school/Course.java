package org.launchcode.java.demos.ExercisesJava.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    ArrayList<String> courseTopics = new ArrayList<>();
    ArrayList<Student> studentsInCourse = new ArrayList<>();

    public Course(String courseName, ArrayList<String> courseTopics, ArrayList<Student> studentsInCourse) {
        this.setCourseName(courseName);
        this.courseTopics = courseTopics;
        this.studentsInCourse = studentsInCourse;
    }

    public void addTopic(String topic){
        courseTopics.add(topic);
    }

    public void addStudent(Student student){
        studentsInCourse.add(student);
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
