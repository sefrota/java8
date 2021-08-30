package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3.0d;
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9d;

        Map<String, List<String>> studentsActivitiesMap =
                StudentDataBase.getAllStudents().stream()
                        .peek(System.out::println)
                        .filter(gradeLevelPredicate)
                        .peek(student -> {
                            System.out.println("After first filter:"+ student);
                        })
                        .filter(gpaPredicate)
                        .peek(student -> {
                            System.out.println("After second filter:"+ student);
                        })
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentsActivitiesMap);
    }
}
