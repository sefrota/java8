package com.sletras.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    private static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream().limit(3).reduce(Integer::sum);
    }

    private static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream().skip(3).reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 6, 8, 9, 11);
        System.out.println(limit(integers).get());;
        System.out.println(skip(integers).get());
    }
}
