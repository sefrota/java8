package com.sletras.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 4, 5, 7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> integerOptional = performMultiplicationWithoutIdentity(integers);
        System.out.println(integerOptional.isPresent());
        System.out.println(integerOptional.get());
    }
}
