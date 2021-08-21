package com.sletras.java.functionalinterfaces;

import java.util.function.UnaryOperator;

//Used mostly when the input and output are of the same time
public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s -> s.concat("hello"));

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("world"));
    }
}
