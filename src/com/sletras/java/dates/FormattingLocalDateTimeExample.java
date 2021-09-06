package com.sletras.java.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    private static void parseLocalDateTime() {
        String dateTime = "2018-04-18T14:33:33";
        LocalDateTime parse = LocalDateTime.parse(dateTime);
        System.out.println(parse);

        /*
        Custom date time
         */
        String customDateTime = "2018-04-18T14|33|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime customParse = LocalDateTime.parse(customDateTime, dateTimeFormatter);
        System.out.println(customParse);

        String customDateTime2 = "2018-04-18abc14|33|33";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime parse1 = LocalDateTime.parse(customDateTime2, dateTimeFormatter2);
        System.out.println(parse1);
    }

    private static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(dateTimeFormatter2);
        System.out.println(convertedDateTime);
    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
