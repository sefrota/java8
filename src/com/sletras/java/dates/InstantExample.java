package com.sletras.java.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(now.getNano());
        //Jan 1st 1970 -> Epoch -> 86400 seconds (day)
        System.out.println(now.getEpochSecond());

        System.out.println(Instant.ofEpochSecond(0));

        Instant instant = Instant.now();

        Duration between = Duration.between(Instant.ofEpochSecond(0), Instant.now());
        System.out.println(between.toHours());
    }
}
