package com.sletras.java.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        //isPresent
        Optional<String> optional = Optional.ofNullable("Hello world");
        System.out.println(optional.isPresent());

        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.isPresent());
        //isPresent

        //ifPresent
        optional.ifPresent(System.out::println);
        optional2.ifPresent(System.out::println);
    }
}
