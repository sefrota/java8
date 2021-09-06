package com.sletras.java.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(10, 20);
        LocalTime localTime1 = LocalTime.of(12, 30);

        long diff = localTime.until(localTime1, ChronoUnit.HOURS);
        System.out.println(diff);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(2);
        System.out.println(duration1.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(10);

        //Duration between = Duration.between(localDate, localDate1);
        //System.out.println(between);
    }
}
