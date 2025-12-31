package de.datetime.api.convert_string_to_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * TestDateExample1.java
 *
 * <p>
 * Example program showing how to convert a date string containing an English
 * month abbreviation into a java.util.Date object using SimpleDateFormat.
 * It also demonstrates formatting the parsed Date back into a string.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TestDateExample1 {

    public static void main(String[] args) {
        // Formatter for parsing dates in the pattern "d-MMMM-yyyy" using English month names.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-MMMM-yyyy", Locale.ENGLISH);
        String dateInString = "7-Jun-2013";

        try {
            // Parse the string into a Date object.
            Date date = simpleDateFormat.parse(dateInString);

            // Print the parsed Date and format it back to a string.
            System.out.println(date);
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException parseException) {
            // Handle invalid date formats or parsing failures.
            parseException.printStackTrace();
        }
    }
}
