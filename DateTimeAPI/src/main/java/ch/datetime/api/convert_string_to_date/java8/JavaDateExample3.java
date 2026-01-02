package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * JavaDateExample3.java
 *
 * <p>
 * Demonstrates how to parse and format dates using the {@link java.time} API
 * with a custom {@link java.time.format.DateTimeFormatter}. This example
 * parses a date string in the format {@code d/MM/yyyy} (e.g., 16/08/2016)
 * into a {@link java.time.LocalDate} instance and then formats it back into
 * the same pattern.
 * <p>
 * This approach is useful when working with non‑ISO date formats commonly
 * found in user input, logs, or external systems.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample3 {

    public static void main(String[] args) {
        // Creates a DateTimeFormatter using the pattern d/MM/yyyy (e.g., 16/08/2016)
        // for parsing and formatting dates in day/month/year format.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "16/08/2016";

        // Parses the date string using the specified formatter to obtain a LocalDate,
        // prints the resulting LocalDate in ISO‑8601 format, and then formats it back
        // into the original custom pattern for display.
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        System.out.println(formatter.format(localDate));
    }
}
