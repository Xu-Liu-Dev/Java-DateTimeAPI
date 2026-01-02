package ch.datetime.api.convert_string_to_date.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/**
 * JavaDateExample8.java
 *
 * <p>
 * Demonstrates how Java's {@link java.time} API handles parsing errors when a date
 * string does not match the expected pattern. The example attempts to parse a
 * date in the format {@code d-MMM-yyyy} using a US locale, but the input
 * {@code 16-ABC-2016} contains an invalid month abbreviation, which triggers a
 * {@link java.time.format.DateTimeParseException}.
 * <p>
 * The exception is caught and handled gracefully, allowing the application to
 * report the parsing failure without terminating unexpectedly.
 */
public class JavaDateExample8 {

    // Defines a DateTimeFormatter using the pattern d-MMM-yyyy (e.g., 16-Aug-2016)
    // and applies the US locale to correctly interpret English month abbreviations.
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.US);

    public static void main(String[] args) {
        // Attempts to parse the input string using the specified formatter. Since the
        // month value "ABC" is invalid for the d-MMM-yyyy pattern, parsing will fail
        // and a DateTimeParseException will be thrown. The exception is caught to
        // handle the error gracefully and report the failure without terminating the program.
        try {
            LocalDate localDate = LocalDate.parse("16-ABC-2016", dtf);
            System.out.println(dtf.format(localDate));
        } catch (DateTimeParseException e) {
            System.err.println("Unable to parse the date!");
        }
    }
}
