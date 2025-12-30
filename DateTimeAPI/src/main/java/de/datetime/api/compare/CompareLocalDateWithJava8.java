package de.datetime.api.compare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * CompareLocalDateWithJava8.java
 * <p>
 * Utility class for demonstrating various ways to compare {@link java.time.LocalDate}
 * using Java 8's Date and Time API.
 *
 * <p>This class can be extended with examples such as:
 * <ul>
 *     <li>Comparing two LocalDate instances</li>
 *     <li>Checking whether a date is before or after another date</li>
 *     <li>Validating equality between dates</li>
 * </ul>
 *
 * <p>Designed for educational and reference purposes when working with
 * Java 8's modern time API.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-30
 */
public class CompareLocalDateWithJava8 {

    public static void main(String[] args) {
        // Create a DateTimeFormatter using the pattern "uuuu-MM-dd".
        // "uuuu" is preferred over "yyyy" for strict year parsing in the Java 8 time API.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        // Parse two date strings into LocalDate instances.
        LocalDate date1 = LocalDate.parse("2020-02-01", dateTimeFormatter);
        LocalDate date2 = LocalDate.parse("2020-01-31", dateTimeFormatter);

        // Print the parsed dates.
        System.out.println("date1 : " + date1);
        System.out.println("date2 : " + date2);

        // Check if the two dates are equal.
        if (date1.isEqual(date2)) {
            System.out.println("Date1 is equal Date2");
        }

        // Check if date1 is before date2.
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        }

        // Check if date1 is after date2.
        if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        }

        // Compare the two dates using compareTo(), which returns:
        //   > 0 if date1 is after date2
        //   < 0 if date1 is before date2
        //   = 0 if both dates are equal
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            // This branch is theoretically unreachable because compareTo()
            // only returns -1, 0, or 1 for LocalDate.
            System.out.println("How to get here?");
        }
    }
}
