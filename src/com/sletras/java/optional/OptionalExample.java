package com.sletras.java.optional;

import com.sletras.java.data.Student;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        /*Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> student = Optional.ofNullable(null);


        if (student.isPresent()) {
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        /*String studentName = getStudentName();
        if (studentName != null) {
            System.out.println("Student name length = " + studentName.length());
        } else {
            System.out.println("Name not found");
        }*/

        Optional<String> studentNameOptional = getStudentNameOptional();
        if (studentNameOptional.isPresent()) {
            System.out.println("Student name length = " +studentNameOptional.get().length());
        } else {
            System.out.println("Name not found");
        }
    }
}
