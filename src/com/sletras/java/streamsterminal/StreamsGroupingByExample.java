package com.sletras.java.streamsterminal;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;

public class StreamsGroupingByExample {

    private static Map<String, List<Student>> groupByGender() {
        return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> groupByCustomized() {
        return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student ->
            student.getGpa() >= 3.8 ? "OUTSTANDING": "AVERAGE"
        ));
    }

    private static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors
                        .groupingBy(Student::getGradeLevel,
                                Collectors.groupingBy(student ->
                                        student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }

    private static Map<Integer, Integer> twoLevelGrouping_2() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors
                        .groupingBy(Student::getGradeLevel,
                                Collectors.summingInt(Student::getNoteBooks)));
    }

    private static LinkedHashMap<String, Set<Student>> threeArgGrouping_1 () {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors
                        .groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
    }

    private static Map<Integer, Student> calculateTopGpa() {
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        return studentMap;
    }

    private static Map<Integer, Student> calculateLeastGpa() {
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        return studentMap;
    }

    public static void main(String[] args) {
        System.out.println("Students grouped by gender:" + groupByGender());
        System.out.println("Students grouped by gpa customized:" + groupByCustomized());

        System.out.println("Students grouped by two level grouping_1: "+ twoLevelGrouping_1());
        System.out.println("Students grouped by two level grouping_2: "+ twoLevelGrouping_2());

        System.out.println("Students grouped by three argument grouping_1: "+ threeArgGrouping_1());

        System.out.println("The result of the calculation of the top student gpa by grade level is: "+ calculateTopGpa());
        System.out.println("The result of the calculation of the least student gpa by grade level is: "+ calculateLeastGpa());
    }
}
