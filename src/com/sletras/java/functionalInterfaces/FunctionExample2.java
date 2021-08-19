package com.sletras.java.functionalInterfaces;

public class FunctionExample2 {

    static String performConcat(String concat) {
        return FunctionExample.function.apply(concat);
    }

    public static void main(String[] args) {
        String result = performConcat("hello");

        System.out.println("Result: " + result);
    }
}
