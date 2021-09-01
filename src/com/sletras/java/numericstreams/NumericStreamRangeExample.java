package com.sletras.java.numericstreams;

import java.util.SortedMap;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value +","));
        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(1, 50);
        System.out.println(intStream2.count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value +","));

        System.out.println();
        LongStream longStream = LongStream.range(1, 50);
        System.out.println(longStream.count());
        LongStream.range(1,50).forEach(value -> System.out.print(value +","));
        System.out.println();
        LongStream longStream2 = LongStream.rangeClosed(1, 50);
        System.out.println(longStream2.count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value +","));

        System.out.println();
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.print(value +","));
    }
}
