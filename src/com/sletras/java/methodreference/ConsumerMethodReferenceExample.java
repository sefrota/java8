package com.sletras.java.methodreference;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumer = student -> System.out.println(student);
    static Consumer<Student> consumerMethodReference = System.out::println;
    static Consumer<Student> consumerMethodReferenceActivities = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(consumerMethodReference);
        StudentDataBase.getAllStudents().forEach(consumerMethodReferenceActivities);
    }
}
