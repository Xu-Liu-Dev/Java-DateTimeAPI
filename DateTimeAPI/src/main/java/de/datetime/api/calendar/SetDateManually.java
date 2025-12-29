package de.datetime.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * SetDateManually.java
 * <p>
 * Demonstrates how to manually set a specific date using Java's
 * Calendar or Date-Time APIs.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class SetDateManually {

    public static void main(String[] args) {
        // Create a formatter using the pattern yyyy MMM dd HH:mm:ss
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        // Create a Calendar instance representing 2013‑02‑28 13:24:56
        // Note: Months are zero‑based (0 = January, 1 = February, ...)
        Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
        // Print the initial formatted date and time
        System.out.println("#1. " + dateFormat.format(calendar.getTime()));

        // Modify specific fields of the Calendar instance
        calendar.set(Calendar.YEAR, 2014);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.MINUTE, 33);
        // Print the updated formatted date and time
        System.out.println("#2. " + dateFormat.format(calendar.getTime()));
    }
}
