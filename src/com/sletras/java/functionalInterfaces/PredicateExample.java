package com.sletras.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> predicate = integer -> integer%2 == 0;
    private static Predicate<Integer> predicateAnd = integer -> integer%5 == 0;
    private static Predicate<Integer> predicateOr = integer -> integer%3 == 0;

    public static void main(String[] args) {

        System.out.println(predicate.test(12));
        System.out.println(predicate.and(predicateAnd).test(10));
        System.out.println(predicate.and(predicateAnd).test(12));
        System.out.println(predicate.or(predicateOr).test(9));
        System.out.println(predicate.or(predicateOr).test(7));
        System.out.println(predicate.or(predicateOr).negate().test(7));
    }
}
