package ch.datetime.api.compare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * PlusMonthExample.java
 * <p>
 * Example program showing how to calculate a date offset using LocalDate.plusMonths()
 * and evaluate whether a target date occurs six months after a reference date.
 * <p>
 * The program parses two dates, prints them, computes a six‑month offset,
 * and then checks if the second date is on or after that threshold.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class PlusMonthExample {

    public static void main(String[] args) {

        // Defines a DateTimeFormatter using the pattern "uuuu-MM-dd". The use of 'uuuu'
        // ensures strict ISO‑8601 year handling and avoids edge cases associated with 'yyyy'.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        // Parse the base date ("now") and the target date ("date1") from string values.
        // Both dates are created using the same formatter to ensure consistent parsing.
        LocalDate now = LocalDate.parse("2020-01-01", dateTimeFormatter);
        LocalDate date1 = LocalDate.parse("2020-07-01", dateTimeFormatter);

        System.out.println("now: " + now);
        System.out.println("date1: " + date1);

        // Compute the date that occurs six months after the reference date ("now").
        // This value will be used as the threshold for comparison.
        LocalDate nowPlus6Months = now.plusMonths(6);
        System.out.println("nowPlus6Months: " + nowPlus6Months);

        // Determine whether date1 is at least six months later than the base date.
        // The comparison checks if date1 is equal to or after the computed six‑month threshold.
        System.out.println("If date1 older than 6 months?");
        if (date1.isAfter(nowPlus6Months) || date1.isEqual(nowPlus6Months)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
