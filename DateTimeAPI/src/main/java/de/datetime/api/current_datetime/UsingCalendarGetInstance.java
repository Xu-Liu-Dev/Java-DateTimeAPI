package de.datetime.api.current_datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * UsingCalendarGetInstance.java
 * <p>
 * Example program showing how to work with the legacy Calendar class.
 * It retrieves the current system date and time via Calendar.getInstance(),
 * converts it to a Date object, and formats it using SimpleDateFormat.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingCalendarGetInstance {

    public static void main(String[] args) {
        // Defines a SimpleDateFormat using the pattern "yyyy/MM/dd HH:mm:ss". This formatter
        // belongs to the legacy java.text API and is used to format java.util.Date instances.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Retrieve a Calendar instance initialized with the system's default locale and time zone.
        // Calendar.getInstance() provides access to the legacy date/time API.
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));

    }
}
