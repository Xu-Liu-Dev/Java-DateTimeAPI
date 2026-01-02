package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * JavaDateExample4.java
 *
 * Demonstrates how to parse and format dates using the {@link java.time} API
 * with a custom {@link java.time.format.DateTimeFormatter}. This example
 * parses a date string in the pattern {@code E, MMM d yyyy}
 * (e.g., Tue, Aug 16 2016) into a {@link java.time.LocalDate} instance and
 * then formats it back into the same pattern.
 * <p>
 * The formatter uses the {@link java.util.Locale#US} locale to correctly
 * interpret English weekday and month abbreviations such as "Tue" and "Aug".
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample4 {

    public static void main(String[] args) {
        // Creates a DateTimeFormatter using the pattern E, MMM d yyyy
        // (e.g., Tue, Aug 16 2016) and applies the US locale to correctly
        // interpret English weekday and month abbreviations.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM d yyyy", Locale.US);

        String date = "Tue, Aug 16 2016";

        // Parses the input date string using the specified formatter to create a LocalDate,
        // prints the resulting LocalDate in ISO‑8601 format, and then formats it back into
        // the original custom pattern for display.
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        System.out.println(formatter.format(localDate));
    }
}
