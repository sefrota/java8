package com.sletras.java.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*
        Prior to java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        new Thread(runnable).start();

        /*
        After java 8
         */
        Runnable runnableLambda = () -> System.out.println("Inside runnable lambda");

        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Inside lambda runnable lambda 2")).start();
    }
}
