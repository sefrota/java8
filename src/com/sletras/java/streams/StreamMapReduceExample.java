package com.sletras.java.streams;

import com.sletras.java.data.Student;
import com.sletras.java.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int numOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3.0)
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("The number of notebooks among all students is :" + numOfNotebooks());
    }
}
