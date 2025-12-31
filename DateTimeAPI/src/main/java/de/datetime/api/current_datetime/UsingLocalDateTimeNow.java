package de.datetime.api.current_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * UsingLocalDateTimeNow.java
 * <p>
 * Example program that retrieves the current date and time from the system clock
 * and formats it using the pattern "uuuu/MM/dd HH:mm:ss". The formatted output
 * is printed to the console.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingLocalDateTimeNow {

    public static void main(String[] args) {
        // Defines a DateTimeFormatter using the pattern "uuuu/MM/dd HH:mm:ss". The use of 'uuuu'
        // ensures strict ISO‑8601 year handling, while the time portion uses a 24‑hour format.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

        // Obtain the current date and time from the system clock using the default time zone.
        // LocalDateTime.now() provides both date and time components without timezone information.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
