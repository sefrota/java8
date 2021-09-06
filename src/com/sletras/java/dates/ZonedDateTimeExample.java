package com.sletras.java.dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.getOffset());
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(ZoneId.getAvailableZoneIds().size());

        //CST, EST, MST, PST
        System.out.println("Chicago CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));

        ZonedDateTime now = ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println(Clock.systemDefaultZone());
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDateTime2);

        /**
         * Convert from localDateTime, instant to zoned local date and time
         */

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println(localDateTime3);
        System.out.println(localDateTime3.atZone(ZoneId.of("America/Chicago")));

        System.out.println(Instant.now().atZone(ZoneId.of("America/Detroit")));

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-6));
        System.out.println(offsetDateTime);
    }
}
