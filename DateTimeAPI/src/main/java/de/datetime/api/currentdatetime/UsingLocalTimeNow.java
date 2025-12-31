package de.datetime.api.currentdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * UsingLocalTimeNow.java
 * <p>
 * Example program that retrieves the current time from the system clock and
 * formats it using the pattern "HH:mm:ss". The formatted time is then printed
 * to the console.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingLocalTimeNow {

    public static void main(String[] args) {
        // Defines a DateTimeFormatter using the 24‑hour pattern "HH:mm:ss".
        // This formatter is used to format LocalTime values for console output.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Obtain the current time from the system clock using the default time zone.
        // LocalTime.now() returns only the time component without any date information.
        LocalTime localTime = LocalTime.now();
        System.out.println(formatter.format(localTime));
    }
}
