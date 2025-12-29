package de.datetime.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * AddOrSubtractFromDate.java
 *
 * <p>
 * Demonstrates how to add or subtract time units such as days, months,
 * or years from a given date using Java's date-handling APIs.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class AddOrSubtractFromDate {

    public static void main(String[] args) {
        // Create a formatter using the pattern yyyy MMM dd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd");

        // Create a Calendar instance representing 2013‑11‑28
        // Note: Months are zero‑based (0 = January, 10 = November)
        Calendar calendar = new GregorianCalendar(2013, 10, 28);

        // Print the initial date
        System.out.println("Date : " + dateFormat.format(calendar.getTime()));

        // Add 1 month to the current date
        calendar.add(Calendar.MONTH, 1);
        System.out.println("Date : " + dateFormat.format(calendar.getTime()));

        // Subtract 10 days from the current date
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Date : " + dateFormat.format(calendar.getTime()));
    }
}
