package com.sletras.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        Stream<String> ofStream = Stream.of("Adam", "Dan", "Julie");
        ofStream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, x -> x * 2).limit(10);
        iterate.forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream<Integer> generate = Stream.generate(integerSupplier).limit(5);
        generate.forEach(System.out::println);
    }
}
