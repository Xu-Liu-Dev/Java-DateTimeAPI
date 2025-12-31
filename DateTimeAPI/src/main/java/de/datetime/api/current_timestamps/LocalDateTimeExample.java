package de.datetime.api.current_timestamps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTimeExample.java
 * <p>
 * Example program showing how to work with LocalDateTime. It obtains the current
 * system date and time, formats it using the pattern "yyyy-MM-dd HH:mm:ss",
 * and prints the result to the console.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
        // Obtain the current LocalDateTime using the system clock and default time zone.
        // LocalDateTime contains date and time components but no timezone information.
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Defines a DateTimeFormatter using the pattern "yyyy-MM-dd HH:mm:ss". This pattern
        // follows a common ISO-like format with a 24-hour time component.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Timestamp: " + currentDateTime.format(dateTimeFormatter));
    }
}
