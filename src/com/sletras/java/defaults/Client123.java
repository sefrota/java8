package com.sletras.java.defaults;

public class Client123 implements Interface1, Interface2, Interface3{

    @Override
    public void methodA() {
        System.out.println("Inside method A and client 123");
    }

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); //Will resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
