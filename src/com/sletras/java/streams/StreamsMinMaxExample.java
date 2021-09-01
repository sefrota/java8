package com.sletras.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    private static Optional<Integer> maxValue(List<Integer> integerList) {
        return integerList.stream().peek(System.out::println).reduce((int1, int2) -> int1 > int2 ? int1 : int2);
    }

    private static Optional<Integer> minValue(List<Integer> integerList) {
        return integerList.stream().peek(System.out::println).reduce((int1, int2) -> int1 < int2 ? int1 : int2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 6, 8, 9, 11);

        System.out.println("Max value is :" + maxValue(integers).get());
        System.out.println("Min value is :" + minValue(integers).get());
    }
}
