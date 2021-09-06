package com.sletras.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.of(23, 20);
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.of(20, 12, 50);
        System.out.println(localTime2);
        LocalTime localTime3 = LocalTime.of(10, 15, 20, 11);
        System.out.println(localTime3);

        /*
        Getting the values from local time instance
         */
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());

        /*
        Modify values of localtime
         */
        System.out.println(localTime.plusHours(3));
        System.out.println(localTime.minus(10, ChronoUnit.HOURS));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 11));
        System.out.println(localTime.plus(2, ChronoUnit.HOURS));
    }
}
