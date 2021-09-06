package com.sletras.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.of(2012, 3, 23);
        LocalTime localTime = LocalTime.of(10, 20);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2013, 5, 2,10, 20, 23, 30000);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime3);

        /*
        Getting the values from localDateTime
         */
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.isSupported(ChronoUnit.NANOS));
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getDayOfMonth());

        /*
        Modifying localDateTime
         */
        System.out.println(localDateTime.plusHours(3));
        System.out.println(localDateTime.with(ChronoField.HOUR_OF_DAY, 15));

        /*
        Converting localdate, localtime to localdatetime and viceversa
         */
        LocalDate localDate1 = LocalDate.of(1989, 9, 2);
        System.out.println(localDate1);
        System.out.println(localDate1.atTime(20, 23));

        LocalTime localTime1 = LocalTime.of(10, 10);
        System.out.println(localTime1);
        LocalDateTime localDateTime4 = localTime1.atDate(LocalDate.of(2015, 1, 1));
        System.out.println(localDateTime4);
        System.out.println(localDateTime4.toLocalDate());
        System.out.println(localDateTime4.toLocalTime());
    }
}
