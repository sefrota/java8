package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAverageExample {

    private static int sum() {
        return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
    }

    private static double avg() {
        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("The sum of notebooks is : " + sum());
        System.out.println("The average number of notebooks is : " + avg());
    }
}
