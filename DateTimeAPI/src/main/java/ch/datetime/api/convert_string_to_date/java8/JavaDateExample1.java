package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;

/**
 * JavaDateExample1.java
 *
 * Demonstrates how to convert a date represented as a String into a
 * {@link java.time.LocalDate} instance using the ISO‑8601 default format.
 * <p>
 * The example parses a date string in the format {@code yyyy-MM-dd}
 * and prints the resulting {@code LocalDate} object.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class JavaDateExample1 {

    public static void main(String[] args) {
        String date="2016-08-16";

        // Parses the date string using the ISO‑8601 default format (yyyy‑MM‑dd)
        // and converts it into a LocalDate instance.
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
    }
}
