package com.sletras.java.defaults;

public interface Interface1 {

    default void methodA() {
        System.out.println("Inside method A" + this.getClass());
    }
}
