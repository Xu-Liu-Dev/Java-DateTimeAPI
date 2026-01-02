package ch.datetime.api.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateWithinRange.java
 *
 * <p>
 * Demonstrates how to check whether a given date falls within a
 * predefined start and end date range.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class DateWithinRange {

    public static void main(String[] args) throws ParseException {
        // Create a formatter using the pattern yyyy-MM-dd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Define the start and end dates of the valid range
        Date startDate = dateFormat.parse("2020-01-01");
        Date endDate = dateFormat.parse("2020-01-31");

        // Print the start and end dates
        System.out.println("startDate : " + dateFormat.format(startDate));
        System.out.println("endDate : " + dateFormat.format(endDate));

        // Create a validator using the defined date range
        DateRangeValidator dateRangeValidator = new DateRangeValidator(startDate, endDate);

        // The date to be tested
        Date testDate = dateFormat.parse("2020-01-01");
        System.out.println("testDate : " + dateFormat.format(testDate));

        // Check whether the test date falls within the range
        if (dateRangeValidator.isWithinRange(testDate)) {
            System.out.println("testDate is within the date range.");
        } else {
            System.out.println("testDate is NOT within the date range.");
        }

    }
}
