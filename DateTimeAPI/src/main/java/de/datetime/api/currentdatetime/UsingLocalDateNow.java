package de.datetime.api.currentdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * UsingLocalDateNow.java
 * <p>
 * Example program that retrieves the current date from the system clock and
 * formats it using the pattern "uuuu/MM/dd". The formatted result is printed
 * to the console.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingLocalDateNow {

    public static void main(String[] args) {
        // Defines a DateTimeFormatter using the pattern "uuuu/MM/dd". The use of 'uuuu'
        // ensures strict ISO‑8601 year handling and avoids edge cases associated with 'yyyy'.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd");

        // Obtain the current date from the system clock using the default time zone.
        // This value represents today's date without any time-of-day information.
        LocalDate localDate = LocalDate.now();
        System.out.println(formatter.format(localDate));
    }
}
