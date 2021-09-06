package com.sletras.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void main(String[] args) {
        /*
        String to localDate
         */
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        LocalDate formattedDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println(formattedDate);

        String date1 = "20180428";
        LocalDate localDate1 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate1);

        /*
        Custom date format
         */
        String date2 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate parse = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println(parse);

        String format = parse.format(dateTimeFormatter);
        System.out.println(format);
    }
}
