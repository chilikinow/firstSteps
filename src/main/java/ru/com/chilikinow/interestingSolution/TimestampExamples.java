package ru.com.chilikinow.interestingSolution;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimestampExamples {

    public void add() {
        // 2021-03-24 16:48:05.591
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        // 2021-03-24 16:48:05.591
        Date date = new Date();
        Timestamp timestamp2 = new Timestamp(date.getTime());
        System.out.println(timestamp2);

        // convert Instant to Timestamp
        Timestamp timestamp3 = Timestamp.from(Instant.now());
        System.out.println(timestamp3);

        // convert ZonedDateTime to Instant to Timestamp
        Timestamp timestamp4 = Timestamp.from(ZonedDateTime.now().toInstant());
        System.out.println(timestamp4);

        // convert Timestamp to Instant
        Instant instant = timestamp4.toInstant();
        System.out.println(instant);
    }

}
