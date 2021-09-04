package com.sletras.java.optional;

import com.sletras.java.data.Bike;
import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    private static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() > 3.5).ifPresent(System.out::println);
    }

    //flatMap
    private static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() > 3.5).flatMap(Student::getBike).map(Bike::getModel).ifPresent(System.out::println);
    }

    //map
    private static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()){
            studentOptional.filter(student -> student.getGpa() > 3.5)
                    .map(Student::getName)
                    .ifPresent(System.out::println);
        }
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
