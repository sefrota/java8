package com.sletras.java.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (x, y) -> x*y);
    }

    @Override
    public int size(List<Integer> integerList) {
        System.out.println("Overriden size:");
        return integerList.size() * 2;
    }
}
