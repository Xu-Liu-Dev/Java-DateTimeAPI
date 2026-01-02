package ch.datetime.api.convert_string_to_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * TestDateExample4.java
 *
 * <p>
 * Example program showing how to parse date strings containing weekday names
 * and month names using SimpleDateFormat. This class highlights the importance
 * of using the correct pattern and Locale when working with textual date
 * components such as "Fri" or "June".
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TestDateExample4 {

    public static void main(String[] args) {
        // Create a formatter for parsing full weekday names, month names, date, time, and AM/PM.
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a", Locale.ENGLISH);
        String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";

        try {
            // Parse the string into a Date object.
            Date date = formatter.parse(dateInString);

            // Print the parsed Date and format it back to a string.
            System.out.println(date);
            System.out.println(formatter.format(date));
        } catch (ParseException parseException) {
            // Handle parsing errors.
            parseException.printStackTrace();
        }
    }
}
