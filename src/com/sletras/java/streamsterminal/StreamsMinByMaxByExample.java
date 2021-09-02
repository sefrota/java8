package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    private static Optional<Student> minBy_example() {
        return StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    private static Optional<Student> maxBy_example() {
        return StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("minByExample: " + minBy_example());
        System.out.println("maxByExample: " + maxBy_example());
    }
}
