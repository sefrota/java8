package com.sletras.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 5; //Class variables can be modified within the consumer scope, unlike local variables

    public static void main(String[] args) {
        int i = 0;

        //Consumer<Integer> c1 = i -> System.out.println(i);
        Consumer<Integer> c1 = i2 -> {
            //i++;
            value++;
            System.out.println(i2);
        };

        c1.accept(10);
    }
}
