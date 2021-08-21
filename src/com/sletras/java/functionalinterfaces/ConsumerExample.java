package com.sletras.java.functionalinterfaces;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer = (s) -> System.out.println(s);
    static Consumer<Student> consumerName = (s) -> System.out.print(s.getName());
    static Consumer<Student> consumerActivities = (s) -> System.out.println(s.getActivities());

    private static void printStudents() {

        StudentDataBase.getAllStudents().forEach(consumer);
    }

    private static void printNameAndActivities() {

        StudentDataBase.getAllStudents().forEach(consumerName.andThen(consumerActivities));
    }

    private static void printNameAndActivitiesUsingCondition() {

        StudentDataBase.getAllStudents().forEach(s -> {
            if (s.getGradeLevel() >= 3 && s.getGpa() >= 3.9)
                consumerName.andThen(consumerActivities).accept(s);
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        consumer.accept("java8");
        System.out.println("############################### Printing students ######################################");
        printStudents();
        System.out.println("######################### Printing students and activities #############################");
        printNameAndActivities();
        System.out.println("################ Printing students and activities using conditions #####################");
        printNameAndActivitiesUsingCondition();

    }
}
