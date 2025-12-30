package de.datetime.api.compare;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * CompareLocalDateTimeWithJava8.java
 * <p>
 * Demonstrates best‑practice techniques for comparing {@link java.time.LocalDateTime}
 * instances using the Java 8 Date and Time API.
 *
 * <p>This class provides examples of common comparison operations such as:
 * <ul>
 *     <li>Checking equality and ordering</li>
 *     <li>Determining whether a date-time is before or after another</li>
 *     <li>Using Duration and ChronoUnit for precise temporal comparisons</li>
 * </ul>
 *
 * <p>Designed for educational and reference purposes in modern Java applications.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-30
 */
public class CompareLocalDateTimeWithJava8 {
    public static void main(String[] args) {
        // Define a formatter to parse date-time strings in the pattern "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

        // Parse two LocalDateTime instances using the formatter
        LocalDateTime date1 = LocalDateTime.parse("2020-01-31 11:44:43", formatter);
        LocalDateTime date2 = LocalDateTime.parse("2020-01-31 11:44:44", formatter);

        // Print the parsed date-time values for verification
        System.out.println("date1 : " + date1);
        System.out.println("date2 : " + date2);

        // Compare the two LocalDateTime values for equality
        if (date1.isEqual(date2)) {
            System.out.println("Date1 is equal Date2");
        }

        // Check if date1 occurs before date2
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        }

        // Check if date1 occurs after date2
        if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        }
    }
}
