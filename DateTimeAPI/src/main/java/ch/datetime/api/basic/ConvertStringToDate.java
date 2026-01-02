package ch.datetime.api.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ConvertStringToDate.java
 *
 * <p>
 * Utility class that provides methods for converting formatted date-time
 * strings into Java Date or LocalDate/LocalDateTime objects.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class ConvertStringToDate {

    public static void main(String[] args) throws ParseException {
        // Create a formatter that matches the pattern of the input date string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

        // The date-time string to be parsed
        String dateInString = "31-08-1982 10:20:56";

        // Parse the string into a Date object
        Date date = dateFormat.parse(dateInString);

        // Print the resulting Date object
        System.out.println(date);
    }
}
