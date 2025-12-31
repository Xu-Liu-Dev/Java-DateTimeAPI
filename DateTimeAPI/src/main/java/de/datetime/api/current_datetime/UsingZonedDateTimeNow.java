package de.datetime.api.current_datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * UsingZonedDateTimeNow.java
 * <p>
 * Example program showing how to work with ZonedDateTime. It retrieves the current
 * date and time including the system's time zone, prints the formatted value and
 * its offset, then converts the same instant to the Asia/Tokyo time zone and prints
 * the corresponding formatted output and offset.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingZonedDateTimeNow {

    public static void main(String[] args) {
        // Defines a DateTimeFormatter using the pattern "uuuu/MM/dd HH:mm:ss". The 'uuuu' year
        // field follows ISO‑8601 rules, and the time portion uses a 24‑hour clock format.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

        // Obtain the current ZonedDateTime from the system clock. This includes the full
        // date, time, and the system's default time zone and offset.
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(dateTimeFormatter.format(now));
        System.out.println(now.getOffset());

        // Create a ZonedDateTime representing the same instant in the Asia/Tokyo time zone.
        // withZoneSameInstant() preserves the exact moment in time while adjusting the offset.
        ZonedDateTime japanDateTime = now.withZoneSameInstant(ZoneId.systemDefault().of("Asia/Tokyo"));
        System.out.println(dateTimeFormatter.format(japanDateTime));
        System.out.println(japanDateTime.getOffset());
    }
}
