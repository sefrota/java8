package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGradeLevel() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGradeLevelReversed() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name");
        System.out.println(sortStudentByName());
        System.out.println("Students sorted by grade level");
        System.out.println(sortStudentByGradeLevel());
        System.out.println("Students sorted by grade level DESC");
        System.out.println(sortStudentByGradeLevelReversed());
    }
}
