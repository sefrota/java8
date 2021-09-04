package com.sletras.java.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static long checkPerformanceResult(Supplier<Integer> supplier, int numOfTimes) {
        long init = System.currentTimeMillis();
        for (int i=0; i < numOfTimes; i++) {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end - init;
    }

    private static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 100000).sum();
    }

    private static int sumParallelStream() {
        return IntStream.rangeClosed(1, 100000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential stream result: "+ checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel stream result: "+ checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }
}
