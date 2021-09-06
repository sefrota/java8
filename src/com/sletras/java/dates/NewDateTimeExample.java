package com.sletras.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {

        //LocalDate
        System.out.println("localDate: " + LocalDate.now());
        //LocalTime
        System.out.println("localTime: " + LocalTime.now());
        //LocalDateTime
        System.out.println("localDateTime:" + LocalDateTime.now());
    }
}
