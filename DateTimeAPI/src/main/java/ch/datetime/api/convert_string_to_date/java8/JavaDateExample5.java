package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * JavaDateExample5.java
 *
 * <p>
 * Demonstrates how to parse and format date‑time values using the
 * {@link java.time} API together with a custom
 * {@link java.time.format.DateTimeFormatter}. This example parses a
 * date‑time string in the pattern {@code EEEE, MMM d, yyyy hh:mm:ss a}
 * (e.g., Tuesday, Aug 16, 2016 12:10:56 PM) into a
 * {@link java.time.LocalDateTime} instance and then formats it back
 * into the same pattern.
 * <p>
 * The formatter uses the {@link java.util.Locale#US} locale to correctly
 * interpret English weekday names, month abbreviations, and AM/PM markers.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample5 {

    public static void main(String[] args) {
        // Creates a DateTimeFormatter using the pattern EEEE, MMM d, yyyy hh:mm:ss a
        // (e.g., Tuesday, Aug 16, 2016 12:10:56 PM) and applies the US locale to
        // correctly interpret full weekday names, month abbreviations, and AM/PM markers.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm:ss a", Locale.US);

        String date = "Tuesday, Aug 16, 2016 12:10:56 PM";

        // Parses the date‑time string using the specified formatter to create a LocalDateTime,
        // prints the resulting value in ISO‑8601 format, and then formats it back into the
        // original custom pattern for display.
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        System.out.println(localDateTime);
        System.out.println(formatter.format(localDateTime));
    }
}
