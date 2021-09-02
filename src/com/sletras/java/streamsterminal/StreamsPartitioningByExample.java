package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    private static Map<Boolean, List<Student>> partitionBy_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partitionMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        return partitionMap;
    }

    private static Map<Boolean, Set<Student>> partitionBy_2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partitionSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));

        return partitionSet;
    }

    public static void main(String[] args) {

        System.out.println("The result of partitionBy_1 is : "+ partitionBy_1());
        System.out.println("The result of partitionBy_2 is : "+ partitionBy_2());
    }
}
