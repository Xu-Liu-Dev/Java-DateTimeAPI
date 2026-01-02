package ch.datetime.api.current_datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * UsingInstantNow.java
 * <p>
 * Example program showing how to work with Instant, which represents a moment
 * on the UTC time line. The Instant is converted to a ZonedDateTime using the
 * system's default time zone and then formatted for display.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */

public class UsingInstantNow {

    public static void main(String[] args) {
        // Obtain the current Instant representing the exact moment in UTC.
        // Instant is timezone‑agnostic and captures a precise point on the time line.
        Instant now = Instant.now();

        // Defines a DateTimeFormatter using the pattern "uuuu/MM/dd HH:mm:ss". The 'uuuu' year
        // field follows ISO‑8601 rules, and the time portion uses a 24‑hour clock format.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

        // Convert the Instant to a ZonedDateTime using the system's default time zone.
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println(dateTimeFormatter.format(zonedDateTime));
    }
}
