package com.sletras.java.defaults;

public interface Interface2 extends Interface1{

    default void methodB() {
        System.out.println("Inside method B");
    }

    @Override
    default void methodA() {
        System.out.println("Inside method A and interface 2");
    }
}
