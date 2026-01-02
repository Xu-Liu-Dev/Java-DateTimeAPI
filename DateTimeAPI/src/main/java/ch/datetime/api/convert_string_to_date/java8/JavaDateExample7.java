package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * JavaDateExample7.java
 *
 * <p>
 * Demonstrates how to parse an ISO‑8601 date‑time string containing a time‑zone
 * offset using {@link java.time.ZonedDateTime}. The example parses a string such as
 * {@code 2016-08-16T10:15:30+08:00} using {@link java.time.format.DateTimeFormatter#ISO_DATE_TIME},
 * and then shows how to:
 * <ul>
 *     <li>Inspect the resulting {@link java.time.ZonedDateTime}</li>
 *     <li>Retrieve the associated {@link java.time.ZoneId}</li>
 *     <li>Extract the {@link java.time.LocalDate} component</li>
 * </ul>
 * This illustrates how Java's date‑time API preserves both the local date‑time
 * and the originating time‑zone offset when parsing ISO‑8601 formatted values.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample7 {

    public static void main(String[] args) {
        String date = "2016-08-16T10:15:30+08:00";

        // Parses the ISO‑8601 date‑time string into a ZonedDateTime, preserving both the
        // local date‑time and the original time‑zone offset. Prints the resulting value
        // and then outputs the associated ZoneId.
        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime : " + result);
        System.out.println("TimeZone : " + result.getZone());

        // Extracts the LocalDate component from the ZonedDateTime, removing all
        // time and time‑zone information, and prints the resulting date value.
        LocalDate localDate = result.toLocalDate();
        System.out.println("LocalDate : " + localDate);
    }
}
