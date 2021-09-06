package com.sletras.java.dates;

import java.time.LocalDate;
import java.time.temporal.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2021, 1, 22);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2021, 52);
        System.out.println(localDate2);

        /*
        Get values from localDate
         */
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        /*
        Modifying local date
         */
        System.out.println(localDate.plusDays(5));
        System.out.println(localDate.plus(2, DAYS));
        System.out.println(localDate.plusMonths(3));
        System.out.println(localDate.minusDays(10));
        System.out.println(localDate.withYear(1950));
        System.out.println(localDate.with(ChronoField.YEAR, 3000));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println(localDate.minus(10, ChronoUnit.YEARS));

        /*
        Additional support methods
         */
        System.out.println(localDate.isLeapYear());
        System.out.println(LocalDate.of(2000, 1, 1).isLeapYear());
        System.out.println(localDate.isEqual(LocalDate.now().plus(3, DAYS)));
        System.out.println(localDate.isAfter(localDate1));
        System.out.println(localDate.isBefore(localDate2));

        /*
        Unsupported scenarios
         */
        //System.out.println(localDate.minus(2, ChronoUnit.HOURS));
        System.out.println(localDate.isSupported(ChronoUnit.HOURS));
        System.out.println(localDate.isSupported(ChronoUnit.YEARS));
    }
}
