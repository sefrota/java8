package com.sletras.java.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    private static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1, 5).mapToObj(x -> new Integer(x)).collect(Collectors.toList());
    }

    private static long mapToLong() {
        return IntStream.rangeClosed(1, 5).mapToLong(x -> new Long(x)).sum();
    }

    private static double mapToDouble() {
        return IntStream.rangeClosed(1, 5).mapToDouble(x -> new Double(x)).sum();
    }

    public static void main(String[] args) {
        System.out.println("MapToObj: "+ mapToObj());
        System.out.println("MapToLong: "+ mapToLong());
        System.out.println("MapToDouble: "+ mapToDouble());
    }
}
