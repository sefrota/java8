package com.sletras.java.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        System.out.println("The sum is " + IntStream.rangeClosed(1, 50).sum());
        System.out.println("The max is " + IntStream.rangeClosed(1, 50).max().getAsInt());
        System.out.println("The min is " + LongStream.rangeClosed(1, 50).min().getAsLong());
        System.out.println("The avg is " + IntStream.rangeClosed(1, 50).average().getAsDouble());
    }
}
