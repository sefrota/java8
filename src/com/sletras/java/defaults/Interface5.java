package com.sletras.java.defaults;

public interface Interface5 {

    default void method45() {
        System.out.println("Inside method 45" + this.getClass());
    }
}
