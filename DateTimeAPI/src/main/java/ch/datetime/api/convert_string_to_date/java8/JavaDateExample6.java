package ch.datetime.api.convert_string_to_date.java8;

import java.time.*;

/**
 * JavaDateExample6.java
 *
 * <p>
 * Demonstrates how to work with {@link java.time.Instant} and convert it into
 * various date‑time representations using the {@link java.time} API. The example
 * parses an ISO‑8601 instant string (e.g., 2016‑08‑16T15:23:01Z) and shows how to:
 * <ul>
 *     <li>Display the raw {@code Instant}</li>
 *     <li>Convert the instant to a {@link java.time.LocalDateTime} in UTC</li>
 *     <li>Extract the {@link java.time.LocalDate} component</li>
 *     <li>Convert the instant into {@link java.time.ZonedDateTime} for different time zones</li>
 * </ul>
 * This demonstrates how a single moment in time can be represented differently
 * depending on the target time zone.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample6 {

    public static void main(String[] args) {
        String dateInString = "2016-08-16T15:23:01Z";

        // Parses the ISO‑8601 date‑time string (e.g., 2016‑08‑16T15:23:01Z)
        // into an Instant representing a specific moment on the UTC time line.
        Instant instant = Instant.parse(dateInString);
        System.out.println("Instant : " + instant);

        // Converts the Instant into a LocalDateTime using the UTC time zone,
        // producing a date‑time value without any associated time‑zone information.
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        System.out.println("LocalDate : " + result.toLocalDate());

        // Converts the Instant into a ZonedDateTime using the Asia/Tokyo time zone,
        // producing a date‑time value that includes full time‑zone information.
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);

        // Converts the Instant into a ZonedDateTime using the Europe/Athens time zone,
        // producing a date‑time value that includes full time‑zone and offset information.
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }
}
