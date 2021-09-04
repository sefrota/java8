package com.sletras.java.parallelstream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//This is an example where unboxing the Integer can cause the performance on the paralel stream to be worse than the sequential
public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {
        return integerList.stream().reduce(0, (x, y) -> x+y);
    }

    public static int parallelSum(List<Integer> integerList) {
        return integerList.stream().parallel().reduce(0, (x, y) -> x+y);
    }

    public static long checkPerformance(Function<List<Integer>, Integer> function, List<Integer> integerList) {
        long init = System.currentTimeMillis();
        function.apply(integerList);
        long end = System.currentTimeMillis();
        return end - init;
    }

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
        System.out.println("Time to execute method sequentialSum: " + checkPerformance(ParallelStreamBoxedExample::sequentialSum, integerList));
        System.out.println("Time to execute method parallelSum: " + checkPerformance(ParallelStreamBoxedExample::parallelSum, integerList));

    }
}
