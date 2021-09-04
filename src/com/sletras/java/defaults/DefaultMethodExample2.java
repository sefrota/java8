package com.sletras.java.defaults;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodExample2 {

    private static final Consumer<Student> studentConsumer = System.out::println;
    private static final Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    private static final Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

    private static void sortByName(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
    }

    private static void sortByGpa(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
    }

    private static void comparatorChain(List<Student> studentList){
        studentList.sort(gradeComparator.thenComparing(nameComparator));
    }

    private static void sortWithNullValues(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        //System.out.println(allStudents);
        System.out.println("Before sort:");
        allStudents.forEach(studentConsumer);
        System.out.println("After sort by name:");
        sortByName(allStudents);
        allStudents.forEach(studentConsumer);
        System.out.println("After sort by gpa:");
        sortByGpa(allStudents);
        allStudents.forEach(studentConsumer);
        System.out.println("After sort by grade and name:");
        comparatorChain(allStudents);
        allStudents.forEach(studentConsumer);
        List<Student> allStudentsWithNull = StudentDataBase.getAllStudentsWithNull();
        System.out.println("After sort with null values");
        sortWithNullValues(allStudentsWithNull);
        allStudentsWithNull.forEach(studentConsumer);
    }
}
