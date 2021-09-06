package com.sletras.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, 5, 20);
        LocalDate localDate1 = LocalDate.of(2018, 7, 21);

        /*
        *
         */

        Period period = localDate.until(localDate1);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println(period1.getDays());
        Period period2 = Period.ofYears(20);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period between = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
        System.out.println(between.getDays());
        System.out.println(between.getMonths());
        System.out.println(between.getYears());

    }
}
