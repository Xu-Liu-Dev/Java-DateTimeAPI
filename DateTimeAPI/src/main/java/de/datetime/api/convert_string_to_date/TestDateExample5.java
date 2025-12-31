package de.datetime.api.convert_string_to_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * TestDateExample5.java
 *
 * <p>
 * Example program showing how to parse date‑time strings that include
 * weekday names, month names, time values, and AM/PM markers using
 * SimpleDateFormat. This class highlights how to work with both textual
 * and numeric components in date‑time patterns.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TestDateExample5 {

    public static void main(String[] args) {
        // Formatter for parsing ISO‑8601 style timestamps with a numeric timezone offset.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String dateInString = "2014-10-05T15:23:01Z";

        try {
            // Replace the trailing 'Z' (UTC indicator) with '+0000' to match the formatter pattern.
            Date date = simpleDateFormat.parse(dateInString.replaceAll("Z$", "+0000"));
            // Print the parsed Date object.
            System.out.println(date);

            // Print the system's default time zone.
            System.out.println("time zone : " + TimeZone.getDefault().getID());
            // Format the Date back into a string using the same pattern.
            System.out.println(simpleDateFormat.format(date));

        } catch (ParseException parseException) {
            // Handle parsing errors.
            parseException.printStackTrace();
        }
    }
}
