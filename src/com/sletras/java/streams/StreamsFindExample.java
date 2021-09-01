package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {

    private static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.0).findAny();
    }

    private static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.0).findFirst();
    }

    public static void main(String[] args) {
        System.out.println("Result of findAny:" + findAny());
        System.out.println("Result of findFirst:" + findFirst());
    }
}
