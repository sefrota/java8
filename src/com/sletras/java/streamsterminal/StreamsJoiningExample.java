package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    private static String joining_1(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(", "));
    }

    private static String joining_2(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(", ", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Student names are :"+joining_1());
        System.out.println("Student names are :"+joining_2());
    }
}
