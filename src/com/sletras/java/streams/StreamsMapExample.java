package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMapExample {

    static Function<Student, String> studentNameFunction = Student::getName;

    public static void main(String[] args) {

        System.out.println(namesSet());
        System.out.println(namesList());
    }

    private static Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream()
                .map(studentNameFunction)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    private static List<String> namesList() {
        return StudentDataBase.getAllStudents().stream()
                .map(studentNameFunction)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
