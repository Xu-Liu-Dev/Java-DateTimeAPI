package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * JavaDateExample2.java
 *
 * <p>
 * Demonstrates how to parse and format dates using the {@link java.time} API
 * with a custom {@link java.time.format.DateTimeFormatter}. The example
 * converts a date string in the format {@code d-MMM-yyyy} (e.g., 16-Aug-2016)
 * into a {@link java.time.LocalDate} instance and then formats it back into
 * the same pattern.
 * <p>
 * A specific {@link java.util.Locale} is provided to ensure correct parsing
 * of month abbreviations such as "Aug", which require an English locale.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample2 {

    public static void main(String[] args) {
        // Creates a DateTimeFormatter using the pattern d-MMM-yyyy (e.g., 16-Aug-2016)
        // and specifies the English locale to correctly interpret month abbreviations.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.ENGLISH);

        String date = "16-Aug-2016";

        // Parses the input date string using the specified formatter to create a LocalDate,
        // prints the parsed LocalDate in ISO‑8601 format, and then formats it back into
        // the original custom pattern.
        LocalDate localDate = LocalDate.parse(date, dateFormatter);
        System.out.println(localDate);
        System.out.println(localDate.format(dateFormatter));
    }
}
