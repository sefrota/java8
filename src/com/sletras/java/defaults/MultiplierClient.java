package com.sletras.java.defaults;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
        System.out.println("The multiplication of the list is : " + multiplier.multiply(integerList));
        System.out.println("The size of the list is : " + multiplier.size(integerList));
        System.out.println("Is the list empty? " + Multiplier.isEmpty(integerList));
        System.out.println("Is the list empty? " + Multiplier.isEmpty(Collections.emptyList()));
    }
}
