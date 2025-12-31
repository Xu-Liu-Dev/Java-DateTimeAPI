package de.datetime.api.currenttimestamps;

import java.sql.Timestamp;
import java.util.Date;

/**
 * TimestampFromDateExample.java
 * <p>
 * Example program showing how to work with legacy java.util.Date and convert it
 * into a java.sql.Timestamp. The program retrieves the current system date/time,
 * extracts its epoch milliseconds, wraps it in a Timestamp, and prints the result.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TimestampFromDateExample {

    public static void main(String[] args) {
        // Create a new Date instance representing the current system date and time.
        Date date = new Date();

        // Create a java.sql.Timestamp based on the epoch milliseconds extracted from the
        // java.util.Date instance. This preserves the same moment in time.
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println("Current Timestamp: " + timestamp);
    }
}
