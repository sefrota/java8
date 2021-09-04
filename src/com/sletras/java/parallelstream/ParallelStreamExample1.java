package com.sletras.java.parallelstream;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> parallelPrintStudentActivities() {

        return StudentDataBase.getAllStudents().stream().parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void checkPerformance(Supplier<List<String>> supplier) {
        long init = System.currentTimeMillis();
        supplier.get();
        long end = System.currentTimeMillis();
        System.out.println("Time to execute method " + supplier.toString() + ": " + (end - init));
    }

    public static void main(String[] args) {
        checkPerformance(ParallelStreamExample1::sequentialPrintStudentActivities);
        checkPerformance(ParallelStreamExample1::parallelPrintStudentActivities);
    }
}
