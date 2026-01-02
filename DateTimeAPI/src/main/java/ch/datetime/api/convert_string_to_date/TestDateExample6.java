package ch.datetime.api.convert_string_to_date;

import java.time.*;

/**
 * TestDateExample6.java
 *
 * <p>
 * Example program showing how to parse ISO‑8601 date‑time strings that end
 * with a 'Z' (UTC indicator) using SimpleDateFormat. Since the pattern 'Z'
 * expects a numeric timezone offset, this class demonstrates how to convert
 * the literal 'Z' into '+0000' for successful parsing.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TestDateExample6 {

    public static void main(String[] args) {
        // ISO‑8601 timestamp with UTC 'Z' suffix.
        String dateInString = "2014-10-05T15:23:01Z";

        // Parse the string directly into an Instant (UTC moment on the timeline).
        Instant instant = Instant.parse(dateInString);
        System.out.println(instant);

        // Convert the Instant to a LocalDateTime in UTC.
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        System.out.println(result);

        // Convert the Instant to a ZonedDateTime in the Africa/Tripoli time zone.
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Tripoli"));
        System.out.println(zonedDateTime);

        // Convert the Instant to a ZonedDateTime in the Europe/Athens time zone.
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }
}
