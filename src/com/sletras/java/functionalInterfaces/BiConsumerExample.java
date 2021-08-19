package com.sletras.java.functionalInterfaces;

import com.sletras.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        StudentDataBase.getAllStudents().forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println("Value of s1 is " + s1 + " and the value of s2 is " + s2);

        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println("The value of " + i1 + " * " + i2 + " is " + (i1 * i2));

        multiply.accept(2, 50);

        BiConsumer<Integer, Integer> division = (i1, i2) -> System.out.println("The value of " + i1 + " / " + i2 + " is " + (i1 / i2));

        division.accept(100, 50);

        multiply.andThen(division).accept(10, 2);

        nameAndActivities();
    }
}
