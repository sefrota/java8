package com.sletras.java.functionalInterfaces;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {


    Predicate<Student> p1 = student -> student.getGradeLevel() >=3;
    Predicate<Student> p2 = student -> student.getGpa() >=3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> b1 = (name, activities) -> System.out.println(name + ": " + activities);

    Consumer<Student> studentConsumer = student -> {
        //if(p1.and(p2).test(student)){
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            b1.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(){
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }

    public static void main(String[] args) {
        PredicateAndConsumerExample example = new PredicateAndConsumerExample();
        example.printNameAndActivities();
    }
}
