package com.sletras.java.functionalInterfaces;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {


    public static void main(String[] args) {
        Supplier<Student> supplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(supplier.get());
        System.out.println("The students are: " + listSupplier.get());
    }
}
