package com.sletras.java.optional;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {
/*
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
*/
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet() {
/*
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
*/
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow() {

/*
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
*/
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available"));

    }

    public static void main(String[] args) {
        System.out.println("[optionalOrElse] The student name is " + optionalOrElse());
        System.out.println("[optionalOrElseGet] The student name is " + optionalOrElseGet());
        System.out.println("[optionalOrElseThrow] The student name is " + optionalOrElseThrow());
    }
}
