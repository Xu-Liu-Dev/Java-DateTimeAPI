package ch.datetime.api.current_datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * UsingDateNow.java
 * <p>
 * Example program showing how to work with the legacy Date and SimpleDateFormat
 * classes. It retrieves the current system date/time and formats it using the
 * pattern "yyyy/MM/dd HH:mm:ss" before printing it to the console.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class UsingDateNow {

    public static void main(String[] args) {
        // Defines a SimpleDateFormat using the pattern "yyyy/MM/dd HH:mm:ss". This formatter
        // is part of the legacy java.text API and is used to format java.util.Date instances.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Retrieve the current date and time using the legacy Date API.
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
