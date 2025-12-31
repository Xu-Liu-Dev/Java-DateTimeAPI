package de.datetime.api.compare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateWithinRange.java
 * <p>
 * Demonstrates the usage of {@link DateRangeValidatorVer2} by creating a date range
 * and checking whether a given test date falls within that range.
 * <p>
 * This example parses dates using a specific formatter, prints the range boundaries,
 * and evaluates a sample date to show how the validator behaves.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class LocalDateWithinRange {

    public static void main(String[] args) {
        // Creates a DateTimeFormatter using the pattern "uuuu-MM-dd", which ensures strict
        // four-digit year parsing and avoids issues that can occur with the legacy "yyyy" pattern.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        // Parse the start and end dates of the range using the defined formatter.
        LocalDate startDate = LocalDate.parse("2020-01-01", dateTimeFormatter);
        LocalDate endDate = LocalDate.parse("2020-01-31", dateTimeFormatter);

        System.out.println("startDate : " + startDate);
        System.out.println("endDate : " + endDate);

        // Create a validator instance using the specified start and end dates.
        DateRangeValidatorVer2 validator = new DateRangeValidatorVer2(startDate, endDate);

        // Parse the date to be validated and output it for reference before performing
        // the range check.
        LocalDate testDate = LocalDate.parse("2020-01-01", dateTimeFormatter);
        System.out.println("\ntestDate : " + testDate);

        // Validate the test date against the configured date range. The result of the
        // validation is printed to indicate whether the date is inside or outside the range.
        if (validator.isWithinRange(testDate)) {
            System.out.println("testDate is within the date range.");
        } else {
            System.out.println("testDate is NOT within the date range.");
        }
    }
}
