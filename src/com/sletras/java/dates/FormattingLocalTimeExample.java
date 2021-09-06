package com.sletras.java.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

    public static void main(String[] args) {
        String time = "13:10";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(localTime1);

        /*
        Custom defined time format
         */
        String timeCustom = "13ª10";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHªmm");
        LocalTime localTime2 = LocalTime.parse(timeCustom, formatter);
        System.out.println(localTime2);

        System.out.println(formatter.format(localTime2));

        String time2 = "13ª10ª22";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHªmmªss");
        LocalTime parse = LocalTime.parse(time2, formatter1);
        System.out.println(parse);

        System.out.println(formatter1.format(parse));
    }
}
