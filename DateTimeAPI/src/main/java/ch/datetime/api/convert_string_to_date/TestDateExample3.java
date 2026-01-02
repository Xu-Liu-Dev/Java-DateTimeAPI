package ch.datetime.api.convert_string_to_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * TestDateExample3.java
 *
 * <p>
 * Example program showing how to parse date strings with various formats using
 * SimpleDateFormat and convert them into java.util.Date objects for further
 * processing or output formatting.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TestDateExample3 {

    public static void main(String[] args) {
        // Create a formatter for parsing dates in the pattern "E, MMM dd yyyy" using English locale.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, MMM dd yyyy", Locale.ENGLISH);
        String dateInString = "Fri, June 7 2013";

        try {
            // Parse the string into a Date object.
            Date date = simpleDateFormat.parse(dateInString);

            // Print the parsed Date and format it back to a string.
            System.out.println(date);
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException parseException) {
            // Handle parsing errors.
            parseException.printStackTrace();
        }
    }
}
