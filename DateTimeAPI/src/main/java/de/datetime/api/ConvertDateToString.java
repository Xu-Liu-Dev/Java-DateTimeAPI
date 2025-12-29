package de.datetime.api;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ConvertDateToString.java
 *
 * <p>
 * Utility class providing methods to convert various Java Date/Time objects
 * into formatted String representations using the modern Date-Time API.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class ConvertDateToString {

    public static void main(String[] args) {
        // Create a formatter to convert the current date and time into the pattern yyyy/MM/dd HH:mm:ss
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // Get the current system date and time
        Date date = new Date();
        // Format the Date object into a string
        String dateString = dateFormat.format(date);
        // Print the formatted date-time string
        System.out.println(dateString);
    }
}
