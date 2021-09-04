package com.sletras.java.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {

        /*
        Sort the list in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adam", "Jenny", "John", "Mike", "Ben", "Rick");

        /*
        Prior to Java 8
         */
        /*Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort(): " + stringList);
*/
        /*
        Java 8 approach
         */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using Comparator.naturalOrder(): " +stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
    }
}
