package com.sletras.java.streams;

import java.util.ArrayList;

public class CollectionsVsStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Tony");
        names.add("Jenny");

        names.remove(0);

        System.out.println(names);

        //Streams cannot add or remove items
        //Streams can only access in sequence;
        //Streams are lazily initialized, only started after the final operation;
        //Streams can only be traverse once;
        //Streams perform internal iteration within the elements
    }
}
