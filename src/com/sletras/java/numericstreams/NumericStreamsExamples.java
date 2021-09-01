package com.sletras.java.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExamples {

    private static int sumOfNumbers(List<Integer> integerList) {
        return integerList.stream().reduce(0, Integer::sum); //unboxing operating that converts Integer to int
    }

    private static int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1, 6).sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println(sumOfNumbers(integerList));
        System.out.println(sumOfNumbersIntStream());
    }
}
