package de.datetime.api.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ConvertDateToCalendar.java
 *
 * <p>
 * Demonstrates how to convert a Date object into a Calendar instance
 * using Java's legacy date and time APIs.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class ConvertDateToCalendar {

    public static void main(String[] args) throws ParseException {
        // Create a formatter that matches the pattern of the input date string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        // The date-time string to be parsed
        String dateInString = "22-01-2015 10:20:56";
        // Parse the string into a Date object
        Date date = dateFormat.parse(dateInString);

        // Create a Calendar instance and set its time based on the parsed Date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Print the formatted date from the Calendar instance
        System.out.println("Date : " + dateFormat.format(calendar.getTime()));
    }
}
