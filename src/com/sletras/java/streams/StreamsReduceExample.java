package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream().reduce(((student, student2) ->
                student.getGpa() > student2.getGpa() ? student : student2));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 4, 5, 7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> integerOptional = performMultiplicationWithoutIdentity(integers);
        System.out.println(integerOptional.isPresent());
        System.out.println(integerOptional.get());
        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        System.out.println(highestGPAStudent.get());
    }
}
