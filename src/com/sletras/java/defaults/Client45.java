package com.sletras.java.defaults;

public class Client45 implements Interface4, Interface5{

    //This method needed to be implemented in order to solve the conflicts between the interfaces which implement similar methods
    public void method45() {
        System.out.println("Inside method 45" + this.getClass());
    }

    public static void main(String[] args) {
        Client45 client45 = new Client45();
        client45.method45();
    }
}
