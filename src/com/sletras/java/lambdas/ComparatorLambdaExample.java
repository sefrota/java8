package com.sletras.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
        Prior to Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of comparator is :" + comparator.compare(12, 20));

        /*
        After Java 8
         */
        Comparator<Integer> comparatorLambda = (Integer i1, Integer i2) ->  i1.compareTo(i2);

        System.out.println("Result of comparator lambda is :" + comparatorLambda.compare(12, 30));

        Comparator<Integer> comparatorLambda1 = (i1, i2) ->  i1.compareTo(i2);

        System.out.println("Result of comparator lambda1 is :" + comparatorLambda1.compare(12, 30));
    }
}
