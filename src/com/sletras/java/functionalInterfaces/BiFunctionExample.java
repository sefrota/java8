package com.sletras.java.functionalInterfaces;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> {
        Map<String, Double> studentGradesMap = new HashMap<>();

        students.forEach(student -> {
            if (predicate.test(student)){
                studentGradesMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradesMap;
    };

    public static void main(String[] args) {
        Map<String, Double> result = biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1);
        System.out.println(result);
    }
}
