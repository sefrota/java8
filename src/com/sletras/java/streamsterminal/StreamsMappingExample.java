package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet())));
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet())));
    }
}
